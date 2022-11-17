package com.test.questionsandroid.ui.modelsUi

import com.test.questionsandroid.data.CountriesData

data class CountriesUi(
    val name: String,
    val flag: String
)

fun CountriesData.toCountriesUi() : CountriesUi {
    return CountriesUi(
        name = name,
        flag = flag
    )
}
