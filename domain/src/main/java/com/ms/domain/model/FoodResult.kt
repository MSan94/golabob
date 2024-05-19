package com.ms.domain.model

import com.google.gson.annotations.SerializedName

data class FoodResult(
    @SerializedName("total_count")
    val totalCount : String,
    @SerializedName("row")
    val list : List<FoodData>
)
