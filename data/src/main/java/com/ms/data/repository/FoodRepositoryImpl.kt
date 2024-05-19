package com.ms.data.repository

import com.ms.data.api.FoodApi
import com.ms.data.datasource.FoodDataSource
import com.ms.domain.model.FoodResponse
import com.ms.domain.repository.FoodRepository
import javax.inject.Inject

class FoodRepositoryImpl @Inject constructor(
    private val foodDataSource: FoodDataSource
) : FoodRepository{
    override suspend fun getFoods(): FoodResponse? {
        return foodDataSource.getFoods()
    }
}