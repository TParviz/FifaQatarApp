package com.test.questionsandroid.data.repositories

import com.google.gson.annotations.SerializedName
import com.test.questionsandroid.data.FifaCountriesData

data class FifaCountriesResponse(

    @SerializedName("data")
    val data: List<FifaCountriesData>

)

data class FifaMatchesResponse(

    @SerializedName("data")
    val data: List<MatchesData>

)