package com.mju.buildconfig.di

import com.mju.buildconfig.impl.BuildConfigFieldsProviderImpl
import com.mju.common.BuildConfigFieldProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object BuildConfigModule {
    @Provides
    @Singleton
    fun provideBuildConfigFieldsProvider(
        buildConfigFieldProvider: BuildConfigFieldsProviderImpl
    ): BuildConfigFieldProvider = buildConfigFieldProvider
}