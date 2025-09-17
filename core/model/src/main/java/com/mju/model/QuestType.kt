package com.mju.model

import kotlinx.serialization.Serializable
@Serializable
enum class QuestType(
    val questStyle: String,
    val journeyName: String,
    val journeyType: String,
    val frontImg: Int,
    val backImg: Int
)
