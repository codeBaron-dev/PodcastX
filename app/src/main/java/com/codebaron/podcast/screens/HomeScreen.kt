package com.codebaron.podcast.screens

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.codebaron.podcast.models.podx.Result
import com.codebaron.podcast.models.podx.dummyResult
import com.codebaron.podcast.repository.PodcastViewModel
import com.codebaron.podcast.ui.theme.PodcastTheme
import com.codebaron.podcast.utils.PodXLargeView
import com.codebaron.podcast.utils.isNetworkAvailable
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay

@AndroidEntryPoint
class HomeScreen : ComponentActivity() {
    var podcasts: List<Result>? = emptyList()
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
                    if (isNetworkAvailable(this)) {
                        Observer(homeScreen = this)
                    }
                }
            }
        }
    }
}

@Composable
fun Observer(homeScreen: HomeScreen, podcastViewModel: PodcastViewModel = hiltViewModel()) {
    val podcastState by podcastViewModel.getSearchedPodcast(
        "Business",
        "English",
        "1",
        homeScreen
    ).observeAsState(emptyList())
    LaunchedEffect(Unit) {
        delay(3000)
    }
    podcastState?.let { PodXLargeView(isPlaying = false, it.ifEmpty { dummyResult}) }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PodcastTheme {
        PodXLargeView(false, dummyResult)
    }
}