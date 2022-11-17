package com.test.questionsandroid.ui.modelsUi

import com.test.questionsandroid.data.FifaCountriesData

data class FifaCountriesUi(
    val name: String,
    val flag: String
)

fun FifaCountriesData.toFifaCountriesUi() : FifaCountriesUi {
    return FifaCountriesUi(
        name = nameEng,
        flag = flag,
    )
}