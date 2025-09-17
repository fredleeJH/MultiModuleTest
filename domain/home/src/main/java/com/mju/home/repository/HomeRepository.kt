package com.mju.home.repository

import com.mju.home.model.Dummy
import com.mju.home.model.DummyResult

interface HomeRepository {
    suspend fun getDummies(request: Dummy): Result<DummyResult>
}