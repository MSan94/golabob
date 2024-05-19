package com.ms.data.datasource

import com.ms.data.api.FoodApi
import com.ms.domain.model.FoodResponse
import javax.inject.Inject

class FoodDataSourceImpl @Inject constructor(
    private val foodApi: FoodApi
) : FoodDataSource {

    override suspend fun getFoods(): FoodResponse? {
        return foodApi.getFoods()
    }
}