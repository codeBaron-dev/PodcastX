package com.codebaron.podcast.repository

import com.codebaron.podcast.models.genre.PodcastGenres
import com.codebaron.podcast.models.podx.Podcasts
import com.codebaron.podcast.utils.GENRE_URL
import com.codebaron.podcast.utils.SEARCH_URL
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.HeaderMap
import retrofit2.http.Query

interface ApiEndPoint {

    @GET(SEARCH_URL)
    suspend fun searchPodcast(
        @HeaderMap headers: Map<String, String>,
        @Query("q", encoded = true) searchContent: String,
        @Query("language", encoded = true) language: String,
        @Query("safe_mode", encoded = true) safetyMode: String,
    ): Response<Podcasts>

    @GET(GENRE_URL)
    suspend fun getPodcastGenre(@HeaderMap headers: Map<String, String>): Response<PodcastGenres>
}