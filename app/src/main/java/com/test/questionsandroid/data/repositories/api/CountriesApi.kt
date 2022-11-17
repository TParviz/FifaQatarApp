package com.test.questionsandroid.data.repositories.api

import com.test.questionsandroid.data.repositories.CountriesResponse
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Headers

interface CountriesApi {

    @Headers(
        "x-rapidapi-key: 78cc5f5daf3454992d2a739eb68ae49e",
        "x-rapidapi-host: v3.football.api-sports.io"
    )
    @GET("countries")
    suspend fun getCountries(): CountriesResponse
}