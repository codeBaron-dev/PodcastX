package com.codebaron.podcast.repository

import android.content.Context
import com.codebaron.podcast.models.genre.PodcastGenres
import com.codebaron.podcast.models.podx.Result

interface PodcastRepository {
    suspend fun searchPodcast(searchParam: String, language: String, safeMode: String, context: Context): List<Result>?
    suspend fun getPodcastGenre(): PodcastGenres?
}