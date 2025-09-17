package com.mju.home.service

import com.mju.home.dto.request.HomeRequestDto
import com.mju.home.dto.response.HomeResponseDto
import network.model.BaseResponse
import retrofit2.http.Body
import retrofit2.http.POST


interface HomeService {
    @POST("/api/v1/service")
    suspend fun getDummies(
        @Body request: HomeRequestDto
    ): BaseResponse<HomeResponseDto>
}