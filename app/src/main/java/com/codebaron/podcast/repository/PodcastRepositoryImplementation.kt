package com.codebaron.podcast.repository

import android.content.Context
import android.content.Intent
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.codebaron.podcast.models.genre.PodcastGenres
import com.codebaron.podcast.models.podx.Result
import com.codebaron.podcast.utils.getHeaderMap
import javax.inject.Inject

class PodcastRepositoryImplementation @Inject constructor(private val apiEndPoint: ApiEndPoint) :
    PodcastRepository {

    private var podcastList: List<Result>? = emptyList()

    override suspend fun searchPodcast(
        searchParam: String,
        language: String,
        safeMode: String,
        context: Context
    ): List<Result>? {
        try {
            val podcastsRequest =
                apiEndPoint.searchPodcast(getHeaderMap(), searchParam, language, safeMode)
            if (podcastsRequest.isSuccessful) {
                podcastList = podcastsRequest.body()?.results
            } else {
                val intent = Intent("ERROR-MSG")
                intent.putExtra("message", "An error occurred")
                LocalBroadcastManager.getInstance(context).sendBroadcast(intent)
            }
        } catch (exception: Exception) {
            exception.message
        }
        return podcastList
    }

    override suspend fun getPodcastGenre(): PodcastGenres? {
        TODO("Not yet implemented")
    }
}