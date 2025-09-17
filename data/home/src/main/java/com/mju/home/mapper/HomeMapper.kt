package com.mju.home.mapper

import com.mju.home.dto.request.HomeRequestDto
import com.mju.home.dto.response.HomeResponseDto
import com.mju.home.model.Dummy
import com.mju.home.model.DummyResult

fun Dummy.toData(): HomeRequestDto =
    HomeRequestDto(
        id = this.id,
        email = this.email
    )

fun HomeResponseDto.toDomain(): DummyResult =
    DummyResult(
        info = info
    )
