package com.ms.data.api

import com.ms.domain.model.FoodResponse
import retrofit2.Response
import retrofit2.http.GET

interface FoodApi {

    @GET("")
    suspend fun getFoods() : FoodResponse?

}