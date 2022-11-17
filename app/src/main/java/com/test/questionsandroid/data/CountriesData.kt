package com.test.questionsandroid.data

import com.google.gson.annotations.SerializedName


data class CountriesData(
    @SerializedName("name")
    val name : String,

    @SerializedName("code")
    val code : String,

    @SerializedName("flag")
    val flag : String
)
