package com.test.questionsandroid.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

open class ConnectionFactory {

    fun getRetrofit(baseUrl: String = BASE_URL): Retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(baseUrl)
        .build()

    companion object {
        private const val BASE_URL = "https://v3.football.api-sports.io/"
        const val FIFA_BASE_URL = "http://api.cup2022.ir/api/v1/"
    }
}