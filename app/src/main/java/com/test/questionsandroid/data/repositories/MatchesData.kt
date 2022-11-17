package com.test.questionsandroid.data.repositories

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MatchesData(

    val away_score: Int,
    val away_scores: List<String>,
    val away_team_id: String,
    val finished: String,
    val group: String,
    val home_score: Int,
    val home_scores: List<String>,
    val home_team_id: String,
    val id: String,
    val local_date: String,
    val matchDay: String,
    val stadium_id: String,
    val time_elapsed: String,
    val type: String,
    val home_team_en: String,
    val away_team_en: String,
    val home_flag: String,
    val away_flag: String

) : Parcelable
