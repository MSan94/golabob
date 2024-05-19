package com.ms.golabob.di

import com.ms.domain.repository.FoodRepository
import com.ms.domain.usecase.GetFoodRepoUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {

    @Provides
    @Singleton
    fun provideGetFoodRepoUseCase(repository: FoodRepository) = GetFoodRepoUseCase(repository)

}