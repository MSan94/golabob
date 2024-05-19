package com.ms.domain.model

import com.google.gson.annotations.SerializedName

data class FoodResponse(
    @SerializedName("COOKRCP01")
    val response : FoodResult
)
