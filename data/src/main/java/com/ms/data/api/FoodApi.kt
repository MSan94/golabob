package com.ms.data.api

import com.ms.domain.model.FoodResponse
import retrofit2.Response
import retrofit2.http.GET

interface FoodApi {

    @GET("api/bd5c92db27e54283b27c/COOKRCP01/json/1/5")
    suspend fun getFoods() : FoodResponse?

}