package com.example.qazspotting

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.WindowCompat
import androidx.lifecycle.lifecycleScope
import com.example.qazspotting.presentation.theme.ui.QazSpottingTheme
import com.loc.newsapp.domain.usecases.app_entry.AppEntryUseCases
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @Inject
    lateinit var appEntryUseCases: AppEntryUseCases
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        installSplashScreen()
        lifecycleScope.launch {
            appEntryUseCases.readAppEntry().collect(){
                Log.d("Test", it.toString())
            }
        }
        setContent {
            QazSpottingTheme {
                Box(modifier = Modifier.background(color = MaterialTheme.colorScheme.background)) {
                    //val viewModel: OnBoardingViewModel = hiltViewModel()
                    //OnBoardingScreen(
                        //event  = viewModel::onEvent
                    //)
                }
            }
        }
    }
}