package com.mju.home.di

import com.mju.home.datasource.HomeDataSource
import com.mju.home.datasourceimpl.HomeDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class HomeDataModule {
    @Binds
    @Singleton
    abstract fun bindDummyRemoteDataSource(impl: HomeDataSourceImpl): HomeDataSource
}