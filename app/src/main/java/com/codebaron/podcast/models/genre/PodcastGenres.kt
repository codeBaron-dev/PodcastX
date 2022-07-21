package com.codebaron.podcast.models.genre

data class PodcastGenres(
    val genres: List<Genre>
)

val dummyPodcastGenres = PodcastGenres(dummyGenres)