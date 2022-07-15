package com.codebaron.podcast.models

data class Genre(
    val id: Int? = null,
    val name: String? = null,
    val parent_id: Int? = null
)

val dummyGenres = listOf(
    Genre(
        id = 139,
        name = "VR & AR",
        parent_id = 127
    ),
    Genre(
        id = 140,
        name = "Web Design",
        parent_id = 127
    ),
    Genre(
        id = 142,
        name = "English Learning",
        parent_id = 116
    ),
    Genre(
        id = 143,
        name = "Programming",
        parent_id = 127
    ),
    Genre(
        id = 144,
        name = "Personal Finance",
        parent_id = 67
    ),
    Genre(
        id = 115,
        name = "Training",
        parent_id = 111
    )
)