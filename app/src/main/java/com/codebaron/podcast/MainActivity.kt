package com.codebaron.podcast

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import com.codebaron.podcast.navigation.ComposableController
import com.codebaron.podcast.screens.HomeScreen
import com.codebaron.podcast.ui.theme.PodcastTheme
import com.codebaron.podcast.utils.isNetworkAvailable
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PodcastTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    window.setFlags(
                        WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                        WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
                    )
                    ComposableController(this)
                    if (isNetworkAvailable(this)) {
                        LaunchedEffect(Unit) {
                            delay(300)
                            startActivity(Intent(this@MainActivity, HomeScreen::class.java))
                        }
                    }
                }
            }
        }
    }
}