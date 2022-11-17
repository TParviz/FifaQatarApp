package com.test.questionsandroid.data.repositories.api

import com.test.questionsandroid.data.repositories.FifaCountriesResponse
import com.test.questionsandroid.data.repositories.FifaMatchesResponse
import retrofit2.http.GET
import retrofit2.http.Headers

interface FifaCountriesApi {

    @Headers(
        "Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2MzcyNzA4YWZkOWFhYzIyNjcwMzFlMTIiLCJpYXQiOjE2Njg0NDQ0MjQsImV4cCI6MTY2ODUzMDgyNH0.SPjFb804KnERme-2PGif2G_VuQUlHNfnxNjTlflMo5s",
        "Content-Type: application/json"
    )
    @GET("team")
    suspend fun getFifaCountries(): FifaCountriesResponse


    @Headers(
        "Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2MzcyNzA4YWZkOWFhYzIyNjcwMzFlMTIiLCJpYXQiOjE2Njg0NDQ0MjQsImV4cCI6MTY2ODUzMDgyNH0.SPjFb804KnERme-2PGif2G_VuQUlHNfnxNjTlflMo5s",
        "Content-Type: application/json"
    )
    @GET("match")
    suspend fun getMatches(): FifaMatchesResponse
}