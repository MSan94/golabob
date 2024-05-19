package com.ms.data.datasource

import com.ms.domain.model.FoodResponse

interface FoodDataSource {

    suspend fun getFoods() : FoodResponse?

}