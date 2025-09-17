package com.mju.model

import kotlinx.serialization.Serializable
import com.mju.designsystem.R
@Serializable
enum class QuestType(
    val questStyle: String,
    val journeyName: String,
    val journeyType: String,
    val frontImg: Int,
    val backImg: Int
) {
    RECORDING(
        "RECORDING",
        "감정 직면",
        "FACE_EMOTION",
        R.drawable.ic_home,
        R.drawable.ic_home
    ),
    ACTIVE(
        "ACTIVE",
        "감정 정리",
        "PROCESS_EMOTION",
        R.drawable.ic_home,
        R.drawable.ic_home
    );

    companion object {
        fun fromQuestStyle(questName: String): QuestType =
            questName.trim()
                .let { questName ->
                    entries.firstOrNull {
                        it.questStyle.equals(
                            questName,
                            ignoreCase = true
                        )
                    }
                } ?: RECORDING

        fun fromJourneyName(journeyName: String): QuestType =
            journeyName.trim()
                .let { journeyName -> entries.firstOrNull { it.journeyName == journeyName } }
                ?: RECORDING

        fun fromJourneyType(journeyType: String): QuestType =
            journeyType.trim()
                .let { journeyType -> entries.firstOrNull { it.journeyType == journeyType } }
                ?: RECORDING

        fun getJourneyName(journeyType: String): String =
            fromJourneyType(journeyType).journeyName
    }
}
