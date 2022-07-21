package com.codebaron.podcast.repository

sealed class StateEvents {
    object PodcastEvent: StateEvents()
}
