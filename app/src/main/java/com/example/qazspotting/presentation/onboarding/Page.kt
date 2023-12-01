package com.example.qazspotting.presentation.onboarding

import androidx.annotation.DrawableRes
import com.example.qazspotting.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes
    val image: Int,
    val contentDescription: String
    )

val pages = listOf(
    Page(
        title = "Qazaqstandyq ushaqtar",
        description = "Barlyq qazaqstandyq aue kompaialardyn ushaqtarynyn aqparatyn biletin qosymsha",
        image = R.drawable.qazaq_air_onboarding_img1,
        contentDescription = "Pre app page"
    ),
    Page(
        title = "Надо добавить позже",
        description = "Barlyq qazaqstandyq aue kompaialardyn ushaqtarynyn aqparatyn biletin qosymsha",
        image = R.drawable.qazaq_air_onboarding_img1,
        contentDescription = "Pre app page"
    ),
    Page(
        title = "Надо добавить позже",
        description = "Надо добавить позже",
        image = R.drawable.qazaq_air_onboarding_img1,
        contentDescription = "Pre app page"
    )
)
