package com.test.questionsandroid.usecases

import com.test.questionsandroid.data.FifaCountriesData
import com.test.questionsandroid.data.repositories.FifaDataRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import javax.inject.Singleton

interface GetFifaCountriesUseCases : FlowUseCase<Unit, List<FifaCountriesData>>

@Singleton
class FifaCountriesUseCases @Inject constructor(
    private val fifaDataRepository: FifaDataRepository
) : GetFifaCountriesUseCases {
    override fun execute(param: Unit): Flow<Result<List<FifaCountriesData>>> = flow {
        emit(Result.success(fifaDataRepository.getFifaCountries()))
    }
}