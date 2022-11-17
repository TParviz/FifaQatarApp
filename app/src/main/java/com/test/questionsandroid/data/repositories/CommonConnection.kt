package com.test.questionsandroid.data.repositories

import com.test.questionsandroid.data.ConnectionFactory
import com.test.questionsandroid.data.repositories.api.CountriesApi
import com.test.questionsandroid.data.repositories.api.FifaCountriesApi

class CommonConnection : ConnectionFactory() {
    val countriesApi: CountriesApi = getRetrofit().create(CountriesApi::class.java)
    val fifaCountriesApi: FifaCountriesApi = getRetrofit(FIFA_BASE_URL).create(FifaCountriesApi::class.java)
}