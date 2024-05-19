package com.ms.domain.repository

import com.ms.domain.model.FoodResponse

interface FoodRepository {
    suspend fun getFoods() : FoodResponse?
}