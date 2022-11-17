package com.test.questionsandroid.ui.viewmodels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.test.questionsandroid.ui.modelsUi.CountriesUi
import com.test.questionsandroid.ui.modelsUi.FifaCountriesUi
import com.test.questionsandroid.ui.modelsUi.toCountriesUi
import com.test.questionsandroid.ui.modelsUi.toFifaCountriesUi
import com.test.questionsandroid.usecases.CountriesUseCases
import com.test.questionsandroid.usecases.FifaCountriesUseCases
import com.test.questionsandroid.usecases.FifaMatchesUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CountriesViewModel @Inject constructor(
    private val countriesUseCase: CountriesUseCases,
    private val fifaCountriesUseCases: FifaCountriesUseCases,
    private val fifaMatchesUseCases: FifaMatchesUseCases
) : ViewModel() {

    private val _countries = MutableLiveData<List<CountriesUi>>()
    val countries: LiveData<List<CountriesUi>> get() = _countries

    private val _fifaCountries = MutableLiveData<List<FifaCountriesUi>>()
    val fifaCountries: LiveData<List<FifaCountriesUi>> get() = _fifaCountries

    init {
        getFifaCountries()
        getFifaMatches()
    }

    private fun getCountries() {
        viewModelScope.launch {
            countriesUseCase(Unit).onStart {
//                _isLoading.value = true
            }.onCompletion {
//                _isLoading.value = false
            }.collect { result ->
                result.onFailure { error ->
                    State.error<String>(error.message)
                }.onSuccess { response ->
                    _countries.value = response.map { it.toCountriesUi() }
                    State.success(response)
                }
            }
        }
    }

    private fun getFifaCountries() {
        viewModelScope.launch {
            fifaCountriesUseCases(Unit).onStart {

            }.onCompletion {

            }.collect { result ->
                result.onFailure { error ->
                    State.error<String>(error.message)
                    Log.d("TAG_COUNR", "error: $error")
                }.onSuccess { response ->
                    Log.d("TAG_COUNR", "response: $response")
                    _fifaCountries.value = response.map { it.toFifaCountriesUi() }
                    State.success(response)
                }

            }
        }
    }

    private fun getFifaMatches() {
        viewModelScope.launch {
            fifaMatchesUseCases(Unit).onStart {

            }.onCompletion {

            }.collect { result ->
                result.onFailure { error ->
                    Log.d("TAG_FIFA", "error: $error")
                    State.error<String>(error.message)
                }.onSuccess { response ->
                    Log.d("TAG_FIFA", "mathces: $response")
                    State.success(response)
                }
            }
        }
    }

}