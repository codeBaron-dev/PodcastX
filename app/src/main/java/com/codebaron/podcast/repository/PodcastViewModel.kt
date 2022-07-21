package com.codebaron.podcast.repository

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.codebaron.podcast.models.podx.Result
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PodcastViewModel @Inject constructor(private val podcastRepository: PodcastRepository) :
    ViewModel() {

    private var podcasts = MutableLiveData<List<Result>?>()

    private val podcastsResults: MutableLiveData<List<Result>> = MutableLiveData()
    val _podcastsResults: LiveData<List<Result>>
    get() = podcastsResults

    fun getSearchedPodcast(
        searchParam: String,
        language: String,
        safeMode: String,
        context: Context
    ): LiveData<List<Result>?> {
        viewModelScope.launch {
            podcasts.postValue(podcastRepository.searchPodcast(searchParam, language, safeMode, context))
        }
        return podcasts
    }
}