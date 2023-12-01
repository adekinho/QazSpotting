package com.loc.newsapp.domain.usecases.app_entry

import com.example.qazspotting.domain.usecases.SaveAppEntry
import dagger.Provides
import javax.inject.Singleton

data class AppEntryUseCases(
    val readAppEntry: ReadAppEntry,
    val saveAppEntry: SaveAppEntry
)

