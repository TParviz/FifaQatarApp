package com.test.questionsandroid.usecases

import com.test.questionsandroid.data.repositories.FifaDataRepository
import com.test.questionsandroid.data.repositories.MatchesData
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import javax.inject.Singleton

interface GetFifaMatchesUseCases : FlowUseCase<Unit, List<MatchesData>>

@Singleton
class FifaMatchesUseCases @Inject constructor(
    private val fifaDataRepository: FifaDataRepository
) : GetFifaMatchesUseCases {
    override fun execute(param: Unit): Flow<Result<List<MatchesData>>> = flow {
        emit(Result.success(fifaDataRepository.getFifaMatches()))
    }

}