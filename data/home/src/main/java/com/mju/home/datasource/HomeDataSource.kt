package com.mju.home.datasource

import com.mju.home.dto.request.HomeRequestDto
import com.mju.home.dto.response.HomeResponseDto
import network.model.BaseResponse

interface HomeDataSource {
    suspend fun getDummies(request: HomeRequestDto): BaseResponse<HomeResponseDto>
}