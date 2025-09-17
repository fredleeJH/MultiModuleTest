package com.mju.home.di

import com.mju.home.repository.HomeRepository
import com.mju.home.repositoryimpl.HomeRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class HomeRepositoryModule {
    @Binds
    @Singleton
    abstract fun bindsDummyRepository(dummyRepositoryImpl: HomeRepositoryImpl): HomeRepository
}