package com.test.questionsandroid.data.repositories

import com.google.gson.annotations.SerializedName
import com.test.questionsandroid.data.CountriesData

data class CountriesResponse (

    @SerializedName("response")
    val member: List<CountriesData>
)