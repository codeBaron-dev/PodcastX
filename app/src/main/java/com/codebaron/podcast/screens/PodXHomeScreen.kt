@file:OptIn(ExperimentalAnimationApi::class)

package com.codebaron.podcast.screens

import androidx.compose.animation.*
import androidx.compose.animation.core.keyframes
import androidx.compose.animation.core.tween
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntSize
import com.codebaron.podcast.models.podx.dummyResult
import com.codebaron.podcast.ui.theme.PodcastTheme
import com.codebaron.podcast.utils.PodXLargeView

@Composable
fun PodXHomeScreen() {
    val randomPodX = dummyResult.random()

    Scaffold {
        PodXLargeView(false, dummyResult)
        //PodXHome(randomPodX)
    }
}

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun PodcastXPlayer(
    visibility: Boolean,
    url: String,
    isPlaying: Boolean,
    title: String,
    thumbnail: String,
    description: String
) {
    //val localContext = LocalContext.current
    //val mediaPlayer = MediaPlayer()
    Surface {
        val expanded by remember { mutableStateOf(false) }

        AnimatedContent(
            targetState = expanded,
            transitionSpec = {
                fadeIn(animationSpec = tween(150, 150)) with
                        fadeOut(animationSpec = tween(150)) using
                        SizeTransform { initialSize, targetSize ->
                            if (targetState) {
                                keyframes {
                                    // Expand horizontally first.
                                    IntSize(targetSize.width, initialSize.height) at 150
                                    durationMillis = 300
                                }
                            } else {
                                keyframes {
                                    // Shrink vertically first.
                                    IntSize(initialSize.width, targetSize.height) at 150
                                    durationMillis = 300
                                }
                            }
                        }
            }
        ) { targetExpanded ->
            if (targetExpanded) {
                //Expanded()
            } else {
                //PodXMediumView(visibility, isPlaying, dummyResult[0])
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PodXHomeScreenUI() {
    PodcastTheme {
        PodXHomeScreen()
    }
}