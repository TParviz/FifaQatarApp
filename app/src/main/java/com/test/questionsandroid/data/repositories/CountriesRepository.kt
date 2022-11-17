package com.test.questionsandroid.data.repositories

import com.test.questionsandroid.data.CountriesData
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CountriesRepository @Inject constructor() {

    suspend fun getCountries(): List<CountriesData> {
        return CommonConnection().countriesApi.getCountries().member
    }

}