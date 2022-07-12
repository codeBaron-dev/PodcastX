package com.codebaron.podcast.screens

import androidx.compose.animation.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.codebaron.podcast.MainActivity
import com.codebaron.podcast.R
import com.codebaron.podcast.navigation.Destinations
import com.codebaron.podcast.ui.theme.PodcastTheme
import com.codebaron.podcast.utils.ConnectionLiveData
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(context: MainActivity, navigationController: NavController) {
    val connectionLiveData = ConnectionLiveData(context)
    BoxWithConstraints(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            painter = painterResource(id = R.drawable.poddy),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(5.dp),
            contentAlignment = Alignment.BottomCenter
        ) {
            ViewAnimations()
        }
        LaunchedEffect(Unit) {
            delay(300)
            navigationController.navigate(Destinations.POD_X_HOME_SCREEN.name)
            /*connectionLiveData.observe(context) { isNetworkAvailable ->
                isNetworkAvailable?.let {
                    if (it) {
                        navigationController.navigate(Destinations.POD_X_HOME_SCREEN.name)
                    }
                }
            }*/
        }
    }
}

@Composable
fun ViewAnimations() {
    val visible by remember { mutableStateOf(true) }
    val density = LocalDensity.current
    AnimatedVisibility(
        visible = visible,
        enter = slideInVertically {
            // Slide in from 40 dp from the top.
            with(density) { -40.dp.roundToPx() }
        } + expandVertically(
            // Expand from the top.
            expandFrom = Alignment.Top
        ) + fadeIn(
            // Fade in with the initial alpha of 0.3f.
            initialAlpha = 0.3f
        ),
        exit = slideOutVertically() + shrinkVertically() + fadeOut()
    ) {
        Text(
            text = buildAnnotatedString {
                withStyle(style = SpanStyle(color = Color.Red)) {
                    append("Pod")
                }
                withStyle(style = SpanStyle(color = Color.White)) {
                    append("X")
                }
            },
            style = MaterialTheme.typography.h1
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SplashScreenUI() {
    PodcastTheme {
        SplashScreen(MainActivity(), rememberNavController())
    }
}