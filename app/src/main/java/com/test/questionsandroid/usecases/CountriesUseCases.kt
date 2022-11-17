package com.test.questionsandroid.usecases

import com.test.questionsandroid.data.CountriesData
import com.test.questionsandroid.data.repositories.CountriesRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import javax.inject.Singleton

interface GetCountriesUseCase : FlowUseCase<Unit, List<CountriesData>>

@Singleton
class CountriesUseCases @Inject constructor(
    private val countriesRepository: CountriesRepository
    ) : GetCountriesUseCase {

    override fun execute(param: Unit): Flow<Result<List<CountriesData>>> = flow {
        emit(Result.success(countriesRepository.getCountries()))
    }
}