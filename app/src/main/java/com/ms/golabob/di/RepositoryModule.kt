package com.ms.golabob.di

import com.ms.data.datasource.FoodDataSourceImpl
import com.ms.data.repository.FoodRepositoryImpl
import com.ms.domain.repository.FoodRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideFoodRepository(
        foodDataSourceImpl: FoodDataSourceImpl
    ) : FoodRepository = FoodRepositoryImpl(foodDataSourceImpl)
}