package com.codebaron.podcast.models

data class PodcastGenres(
    val genres: List<Genre>
)

val dummyPodcastGenres = PodcastGenres(dummyGenres)