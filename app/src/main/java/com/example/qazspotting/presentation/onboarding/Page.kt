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
        title = "Надо добавить позже",
        description = "Надо добавить позже",
        image = R.drawable.beach_image,
        contentDescription = "Pre app page"
    ),
    Page(
        title = "Надо добавить позже",
        description = "Надо добавить позже",
        image = R.drawable.beach_image,
        contentDescription = "Pre app page"
    ),
    Page(
        title = "Надо добавить позже",
        description = "Надо добавить позже",
        image = R.drawable.beach_image,
        contentDescription = "Pre app page"
    )
)
