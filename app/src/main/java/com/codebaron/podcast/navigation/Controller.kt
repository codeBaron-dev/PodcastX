package com.codebaron.podcast.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.codebaron.podcast.MainActivity
import com.codebaron.podcast.navigation.Destinations.SPLASH_SCREEN
import com.codebaron.podcast.screens.SplashScreen

@Composable
fun ComposableController(mainActivity: MainActivity) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = SPLASH_SCREEN.name) {
        composable(SPLASH_SCREEN.name) {
            SplashScreen(mainActivity, navController)
        }
    }
}