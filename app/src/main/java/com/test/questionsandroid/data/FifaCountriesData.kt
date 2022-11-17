package com.test.questionsandroid.data

import com.google.gson.annotations.SerializedName

data class FifaCountriesData(

    @SerializedName("id")
    val id: String,

    @SerializedName("name_en")
    val nameEng: String,

    @SerializedName("name_fa")
    val nameFa: String,

    @SerializedName("flag")
    val flag: String,

    @SerializedName("fifa_code")
    val fifaCode: String,

    @SerializedName("iso2")
    val isoCode: String,

    @SerializedName("groups")
    val groups: String

)