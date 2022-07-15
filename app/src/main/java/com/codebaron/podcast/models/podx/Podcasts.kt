package com.codebaron.podcast.models.podx

data class Podcasts(
    val count: Int? = null,
    val next_offset: Int? = null,
    val results: List<Result>? = null,
    val took: Double? = null,
    val total: Int? = null
)

val dummyPodcasts = Podcasts(
    count = 0,
    next_offset = 20,
    results = dummyResult,
    took = 9.0,
    total = 200
)