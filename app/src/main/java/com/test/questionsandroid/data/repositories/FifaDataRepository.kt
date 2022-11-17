package com.test.questionsandroid.data.repositories

import com.test.questionsandroid.data.FifaCountriesData
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FifaDataRepository @Inject constructor() {

    suspend fun getFifaCountries(): List<FifaCountriesData> {
        return CommonConnection().fifaCountriesApi.getFifaCountries().data
    }

    suspend fun getFifaMatches(): List<MatchesData> {
        return CommonConnection().fifaCountriesApi.getMatches().data
    }
}