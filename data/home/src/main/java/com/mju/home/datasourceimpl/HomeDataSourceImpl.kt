package com.mju.home.datasourceimpl

import com.mju.home.datasource.HomeDataSource
import com.mju.home.dto.request.HomeRequestDto
import com.mju.home.dto.response.HomeResponseDto
import com.mju.home.service.HomeService
import network.model.BaseResponse
import javax.inject.Inject


class HomeDataSourceImpl @Inject constructor(
    private val homeService: HomeService
) : HomeDataSource {
    override suspend fun getDummies(
        request: HomeRequestDto
    ): BaseResponse<HomeResponseDto> =
        homeService.getDummies(request)
}