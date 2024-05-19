package com.ms.golabob.di

import com.ms.data.api.FoodApi
import com.ms.data.datasource.FoodDataSource
import com.ms.data.datasource.FoodDataSourceImpl
import com.ms.data.repository.FoodRepositoryImpl
import com.ms.domain.repository.FoodRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataSourceImplModule {

    @Provides
    @Singleton
    fun provideFoodDataSource(
        foodApi: FoodApi
    ) : FoodDataSource {
        return FoodDataSourceImpl(foodApi)
    }

}