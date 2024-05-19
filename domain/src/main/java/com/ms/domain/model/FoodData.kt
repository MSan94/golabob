package com.ms.domain.model

import com.google.gson.annotations.SerializedName

data class FoodData(
    @SerializedName("RCP_SEQ")
    val rcpSeq : String,
    @SerializedName("RCP_NM")
    val rcpNm : String,
    @SerializedName("RCP_PARTS_DTLS")
    val rcpPartsDtls : String
)
