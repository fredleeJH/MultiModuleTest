package com.mju.home.repositoryimpl

import com.mju.home.mapper.toData
import com.mju.home.mapper.toDomain
import com.mju.home.model.Dummy
import com.mju.home.model.DummyResult
import com.mju.home.repository.HomeRepository
import com.mju.home.service.HomeService
import javax.inject.Inject


class HomeRepositoryImpl @Inject constructor(
    private val homeService: HomeService
) : HomeRepository {
    override suspend fun getDummies(request: Dummy): Result<DummyResult> =
        runCatching {
            val response = homeService.getDummies(request = request.toData())
            response.data.toDomain()
        }
}