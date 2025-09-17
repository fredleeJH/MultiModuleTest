package com.mju.buildconfig.impl

import com.mju.common.BuildConfigFieldProvider
import com.mju.common.BuildConfigFields
import com.mju.buildconfig.BuildConfig.BASE_URL
import com.mju.buildconfig.BuildConfig.KAKAO_NATIVE_KEY


import javax.inject.Inject

class BuildConfigFieldsProviderImpl @Inject constructor() : BuildConfigFieldProvider {
    override fun get(): BuildConfigFields =
        BuildConfigFields(
            baseUrl = BASE_URL,
            kakaoNativeKey = KAKAO_NATIVE_KEY,
            isDebug = true
        )
}