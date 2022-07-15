package com.codebaron.podcast.models.podx

data class Result(
    val audio: String? = null,
    val audio_length: String? = null,
    val description_highlighted: String? = null,
    val description_original: String? = null,
    val explicit_content: Boolean? = null,
    val genres: List<Int>? = null,
    val id: String? = null,
    val image: String? = null,
    val itunes_id: Int? = null,
    val listennotes_url: String? = null,
    val podcast_id: String? = null,
    val podcast_listennotes_url: String? = null,
    val podcast_title_highlighted: String? = null,
    val podcast_title_original: String? = null,
    val pub_date_ms: Long? = null,
    val publisher_highlighted: String? = null,
    val publisher_original: String? = null,
    val rss: String? = null,
    val thumbnail: String? = null,
    val title_highlighted: String? = null,
    val title_original: String? = null,
    val transcripts_highlighted: List<Any>? = null
)
val dummyResult = listOf(
    Result(
        audio = "https://www.listennotes.com/e/p/486a2c0fd6904dbd9e3ee8f299da7c88/",
        audio_length = "00:08:29",
        description_highlighted = "...Richard Lamb says he is confident he can put together a business plan to resurrect the Bradford Bulls in time for the new season. #bradfordbulls #rugbyleague...",
        description_original = "Richard Lamb says he is confident he can put together a business plan to resurrect the Bradford Bulls in time for the new season. #bradfordbulls #rugbyleague",
        explicit_content = false,
        genres = listOf(68, 77, 78, 133),
        id = "486a2c0fd6904dbd9e3ee8f299da7c88",
        image = "https://cdn-images-1.listennotes.com/podcasts/proper-sport-daily-proper-sport-tXKjWYG3rLf.300x300.jpg",
        itunes_id = 1033504184,
        listennotes_url = "https://www.listennotes.com/e/486a2c0fd6904dbd9e3ee8f299da7c88/",
        podcast_id = "0175a31d45ec46f4b222edd19ea2929b",
        podcast_listennotes_url = "https://www.listennotes.com/c/0175a31d45ec46f4b222edd19ea2929b/",
        podcast_title_highlighted = "Proper Sport Mix Tape",
        podcast_title_original = "Proper Sport Mix Tape",
        pub_date_ms = 1483539198000,
        publisher_highlighted = "Proper Sport",
        publisher_original = "Proper Sport",
        rss = "https://audioboom.com/channels/3314883.rss",
        thumbnail = "https://cdn-images-1.listennotes.com/podcasts/proper-sport-daily-proper-sport-tXKjWYG3rLf.300x300.jpg",
        title_highlighted = "Richard Lamb says he confident he can put together a <span class=\"ln-search-highlight\">business</span> plan to resurrect the Bradford Bulls in time for the new season.",
        title_original = "Richard Lamb says he confident he can put together a business plan to resurrect the Bradford Bulls in time for the new season.",
        transcripts_highlighted = listOf(""),
    ),
    Result(
        audio = "https://www.listennotes.com/e/p/486a2c0fd6904dbd9e3ee8f299da7c88/",
        audio_length = "00:08:29",
        description_highlighted = "...Richard Lamb says he is confident he can put together a business plan to resurrect the Bradford Bulls in time for the new season. #bradfordbulls #rugbyleague...",
        description_original = "Richard Lamb says he is confident he can put together a business plan to resurrect the Bradford Bulls in time for the new season. #bradfordbulls #rugbyleague",
        explicit_content = false,
        genres = listOf(68, 77, 78, 133),
        id = "486a2c0fd6904dbd9e3ee8f299da7c88",
        image = "https://cdn-images-1.listennotes.com/podcasts/proper-sport-daily-proper-sport-tXKjWYG3rLf.300x300.jpg",
        itunes_id = 1033504184,
        listennotes_url = "https://www.listennotes.com/e/486a2c0fd6904dbd9e3ee8f299da7c88/",
        podcast_id = "0175a31d45ec46f4b222edd19ea2929b",
        podcast_listennotes_url = "https://www.listennotes.com/c/0175a31d45ec46f4b222edd19ea2929b/",
        podcast_title_highlighted = "Proper Sport Mix Tape",
        podcast_title_original = "Proper Sport Mix Tape",
        pub_date_ms = 1483539198000,
        publisher_highlighted = "Proper Sport",
        publisher_original = "Proper Sport",
        rss = "https://audioboom.com/channels/3314883.rss",
        thumbnail = "https://cdn-images-1.listennotes.com/podcasts/proper-sport-daily-proper-sport-tXKjWYG3rLf.300x300.jpg",
        title_highlighted = "Richard Lamb says he confident he can put together a <span class=\"ln-search-highlight\">business</span> plan to resurrect the Bradford Bulls in time for the new season.",
        title_original = "Richard Lamb says he confident he can put together a business plan to resurrect the Bradford Bulls in time for the new season.",
        transcripts_highlighted = listOf(""),
    ),
    Result(
        audio = "https://www.listennotes.com/e/p/486a2c0fd6904dbd9e3ee8f299da7c88/",
        audio_length = "00:08:29",
        description_highlighted = "...Richard Lamb says he is confident he can put together a business plan to resurrect the Bradford Bulls in time for the new season. #bradfordbulls #rugbyleague...",
        description_original = "Richard Lamb says he is confident he can put together a business plan to resurrect the Bradford Bulls in time for the new season. #bradfordbulls #rugbyleague",
        explicit_content = false,
        genres = listOf(68, 77, 78, 133),
        id = "486a2c0fd6904dbd9e3ee8f299da7c88",
        image = "https://cdn-images-1.listennotes.com/podcasts/proper-sport-daily-proper-sport-tXKjWYG3rLf.300x300.jpg",
        itunes_id = 1033504184,
        listennotes_url = "https://www.listennotes.com/e/486a2c0fd6904dbd9e3ee8f299da7c88/",
        podcast_id = "0175a31d45ec46f4b222edd19ea2929b",
        podcast_listennotes_url = "https://www.listennotes.com/c/0175a31d45ec46f4b222edd19ea2929b/",
        podcast_title_highlighted = "Proper Sport Mix Tape",
        podcast_title_original = "Proper Sport Mix Tape",
        pub_date_ms = 1483539198000,
        publisher_highlighted = "Proper Sport",
        publisher_original = "Proper Sport",
        rss = "https://audioboom.com/channels/3314883.rss",
        thumbnail = "https://cdn-images-1.listennotes.com/podcasts/proper-sport-daily-proper-sport-tXKjWYG3rLf.300x300.jpg",
        title_highlighted = "Richard Lamb says he confident he can put together a <span class=\"ln-search-highlight\">business</span> plan to resurrect the Bradford Bulls in time for the new season.",
        title_original = "Richard Lamb says he confident he can put together a business plan to resurrect the Bradford Bulls in time for the new season.",
        transcripts_highlighted = listOf(""),
    ),
    Result(
        audio = "https://www.listennotes.com/e/p/486a2c0fd6904dbd9e3ee8f299da7c88/",
        audio_length = "00:08:29",
        description_highlighted = "...Richard Lamb says he is confident he can put together a business plan to resurrect the Bradford Bulls in time for the new season. #bradfordbulls #rugbyleague...",
        description_original = "Richard Lamb says he is confident he can put together a business plan to resurrect the Bradford Bulls in time for the new season. #bradfordbulls #rugbyleague",
        explicit_content = false,
        genres = listOf(68, 77, 78, 133),
        id = "486a2c0fd6904dbd9e3ee8f299da7c88",
        image = "https://cdn-images-1.listennotes.com/podcasts/proper-sport-daily-proper-sport-tXKjWYG3rLf.300x300.jpg",
        itunes_id = 1033504184,
        listennotes_url = "https://www.listennotes.com/e/486a2c0fd6904dbd9e3ee8f299da7c88/",
        podcast_id = "0175a31d45ec46f4b222edd19ea2929b",
        podcast_listennotes_url = "https://www.listennotes.com/c/0175a31d45ec46f4b222edd19ea2929b/",
        podcast_title_highlighted = "Proper Sport Mix Tape",
        podcast_title_original = "Proper Sport Mix Tape",
        pub_date_ms = 1483539198000,
        publisher_highlighted = "Proper Sport",
        publisher_original = "Proper Sport",
        rss = "https://audioboom.com/channels/3314883.rss",
        thumbnail = "https://cdn-images-1.listennotes.com/podcasts/proper-sport-daily-proper-sport-tXKjWYG3rLf.300x300.jpg",
        title_highlighted = "Richard Lamb says he confident he can put together a <span class=\"ln-search-highlight\">business</span> plan to resurrect the Bradford Bulls in time for the new season.",
        title_original = "Richard Lamb says he confident he can put together a business plan to resurrect the Bradford Bulls in time for the new season.",
        transcripts_highlighted = listOf(""),
    ),
    Result(
        audio = "https://www.listennotes.com/e/p/486a2c0fd6904dbd9e3ee8f299da7c88/",
        audio_length = "00:08:29",
        description_highlighted = "...Richard Lamb says he is confident he can put together a business plan to resurrect the Bradford Bulls in time for the new season. #bradfordbulls #rugbyleague...",
        description_original = "Richard Lamb says he is confident he can put together a business plan to resurrect the Bradford Bulls in time for the new season. #bradfordbulls #rugbyleague",
        explicit_content = false,
        genres = listOf(68, 77, 78, 133),
        id = "486a2c0fd6904dbd9e3ee8f299da7c88",
        image = "https://cdn-images-1.listennotes.com/podcasts/proper-sport-daily-proper-sport-tXKjWYG3rLf.300x300.jpg",
        itunes_id = 1033504184,
        listennotes_url = "https://www.listennotes.com/e/486a2c0fd6904dbd9e3ee8f299da7c88/",
        podcast_id = "0175a31d45ec46f4b222edd19ea2929b",
        podcast_listennotes_url = "https://www.listennotes.com/c/0175a31d45ec46f4b222edd19ea2929b/",
        podcast_title_highlighted = "Proper Sport Mix Tape",
        podcast_title_original = "Proper Sport Mix Tape",
        pub_date_ms = 1483539198000,
        publisher_highlighted = "Proper Sport",
        publisher_original = "Proper Sport",
        rss = "https://audioboom.com/channels/3314883.rss",
        thumbnail = "https://cdn-images-1.listennotes.com/podcasts/proper-sport-daily-proper-sport-tXKjWYG3rLf.300x300.jpg",
        title_highlighted = "Richard Lamb says he confident he can put together a <span class=\"ln-search-highlight\">business</span> plan to resurrect the Bradford Bulls in time for the new season.",
        title_original = "Richard Lamb says he confident he can put together a business plan to resurrect the Bradford Bulls in time for the new season.",
        transcripts_highlighted = listOf(""),
    ),
    Result(
        audio = "https://www.listennotes.com/e/p/486a2c0fd6904dbd9e3ee8f299da7c88/",
        audio_length = "00:08:29",
        description_highlighted = "...Richard Lamb says he is confident he can put together a business plan to resurrect the Bradford Bulls in time for the new season. #bradfordbulls #rugbyleague...",
        description_original = "Richard Lamb says he is confident he can put together a business plan to resurrect the Bradford Bulls in time for the new season. #bradfordbulls #rugbyleague",
        explicit_content = false,
        genres = listOf(68, 77, 78, 133),
        id = "486a2c0fd6904dbd9e3ee8f299da7c88",
        image = "https://cdn-images-1.listennotes.com/podcasts/proper-sport-daily-proper-sport-tXKjWYG3rLf.300x300.jpg",
        itunes_id = 1033504184,
        listennotes_url = "https://www.listennotes.com/e/486a2c0fd6904dbd9e3ee8f299da7c88/",
        podcast_id = "0175a31d45ec46f4b222edd19ea2929b",
        podcast_listennotes_url = "https://www.listennotes.com/c/0175a31d45ec46f4b222edd19ea2929b/",
        podcast_title_highlighted = "Proper Sport Mix Tape",
        podcast_title_original = "Proper Sport Mix Tape",
        pub_date_ms = 1483539198000,
        publisher_highlighted = "Proper Sport",
        publisher_original = "Proper Sport",
        rss = "https://audioboom.com/channels/3314883.rss",
        thumbnail = "https://cdn-images-1.listennotes.com/podcasts/proper-sport-daily-proper-sport-tXKjWYG3rLf.300x300.jpg",
        title_highlighted = "Richard Lamb says he confident he can put together a <span class=\"ln-search-highlight\">business</span> plan to resurrect the Bradford Bulls in time for the new season.",
        title_original = "Richard Lamb says he confident he can put together a business plan to resurrect the Bradford Bulls in time for the new season.",
        transcripts_highlighted = listOf(""),
    ),
    Result(
        audio = "https://www.listennotes.com/e/p/486a2c0fd6904dbd9e3ee8f299da7c88/",
        audio_length = "00:08:29",
        description_highlighted = "...Richard Lamb says he is confident he can put together a business plan to resurrect the Bradford Bulls in time for the new season. #bradfordbulls #rugbyleague...",
        description_original = "Richard Lamb says he is confident he can put together a business plan to resurrect the Bradford Bulls in time for the new season. #bradfordbulls #rugbyleague",
        explicit_content = false,
        genres = listOf(68, 77, 78, 133),
        id = "486a2c0fd6904dbd9e3ee8f299da7c88",
        image = "https://cdn-images-1.listennotes.com/podcasts/proper-sport-daily-proper-sport-tXKjWYG3rLf.300x300.jpg",
        itunes_id = 1033504184,
        listennotes_url = "https://www.listennotes.com/e/486a2c0fd6904dbd9e3ee8f299da7c88/",
        podcast_id = "0175a31d45ec46f4b222edd19ea2929b",
        podcast_listennotes_url = "https://www.listennotes.com/c/0175a31d45ec46f4b222edd19ea2929b/",
        podcast_title_highlighted = "Proper Sport Mix Tape",
        podcast_title_original = "Proper Sport Mix Tape",
        pub_date_ms = 1483539198000,
        publisher_highlighted = "Proper Sport",
        publisher_original = "Proper Sport",
        rss = "https://audioboom.com/channels/3314883.rss",
        thumbnail = "https://cdn-images-1.listennotes.com/podcasts/proper-sport-daily-proper-sport-tXKjWYG3rLf.300x300.jpg",
        title_highlighted = "Richard Lamb says he confident he can put together a <span class=\"ln-search-highlight\">business</span> plan to resurrect the Bradford Bulls in time for the new season.",
        title_original = "Richard Lamb says he confident he can put together a business plan to resurrect the Bradford Bulls in time for the new season.",
        transcripts_highlighted = listOf(""),
    ),
    Result(
        audio = "https://www.listennotes.com/e/p/486a2c0fd6904dbd9e3ee8f299da7c88/",
        audio_length = "00:08:29",
        description_highlighted = "...Richard Lamb says he is confident he can put together a business plan to resurrect the Bradford Bulls in time for the new season. #bradfordbulls #rugbyleague...",
        description_original = "Richard Lamb says he is confident he can put together a business plan to resurrect the Bradford Bulls in time for the new season. #bradfordbulls #rugbyleague",
        explicit_content = false,
        genres = listOf(68, 77, 78, 133),
        id = "486a2c0fd6904dbd9e3ee8f299da7c88",
        image = "https://cdn-images-1.listennotes.com/podcasts/proper-sport-daily-proper-sport-tXKjWYG3rLf.300x300.jpg",
        itunes_id = 1033504184,
        listennotes_url = "https://www.listennotes.com/e/486a2c0fd6904dbd9e3ee8f299da7c88/",
        podcast_id = "0175a31d45ec46f4b222edd19ea2929b",
        podcast_listennotes_url = "https://www.listennotes.com/c/0175a31d45ec46f4b222edd19ea2929b/",
        podcast_title_highlighted = "Proper Sport Mix Tape",
        podcast_title_original = "Proper Sport Mix Tape",
        pub_date_ms = 1483539198000,
        publisher_highlighted = "Proper Sport",
        publisher_original = "Proper Sport",
        rss = "https://audioboom.com/channels/3314883.rss",
        thumbnail = "https://cdn-images-1.listennotes.com/podcasts/proper-sport-daily-proper-sport-tXKjWYG3rLf.300x300.jpg",
        title_highlighted = "Richard Lamb says he confident he can put together a <span class=\"ln-search-highlight\">business</span> plan to resurrect the Bradford Bulls in time for the new season.",
        title_original = "Richard Lamb says he confident he can put together a business plan to resurrect the Bradford Bulls in time for the new season.",
        transcripts_highlighted = listOf(""),
    ),
    Result(
        audio = "https://www.listennotes.com/e/p/486a2c0fd6904dbd9e3ee8f299da7c88/",
        audio_length = "00:08:29",
        description_highlighted = "...Richard Lamb says he is confident he can put together a business plan to resurrect the Bradford Bulls in time for the new season. #bradfordbulls #rugbyleague...",
        description_original = "Richard Lamb says he is confident he can put together a business plan to resurrect the Bradford Bulls in time for the new season. #bradfordbulls #rugbyleague",
        explicit_content = false,
        genres = listOf(68, 77, 78, 133),
        id = "486a2c0fd6904dbd9e3ee8f299da7c88",
        image = "https://cdn-images-1.listennotes.com/podcasts/proper-sport-daily-proper-sport-tXKjWYG3rLf.300x300.jpg",
        itunes_id = 1033504184,
        listennotes_url = "https://www.listennotes.com/e/486a2c0fd6904dbd9e3ee8f299da7c88/",
        podcast_id = "0175a31d45ec46f4b222edd19ea2929b",
        podcast_listennotes_url = "https://www.listennotes.com/c/0175a31d45ec46f4b222edd19ea2929b/",
        podcast_title_highlighted = "Proper Sport Mix Tape",
        podcast_title_original = "Proper Sport Mix Tape",
        pub_date_ms = 1483539198000,
        publisher_highlighted = "Proper Sport",
        publisher_original = "Proper Sport",
        rss = "https://audioboom.com/channels/3314883.rss",
        thumbnail = "https://cdn-images-1.listennotes.com/podcasts/proper-sport-daily-proper-sport-tXKjWYG3rLf.300x300.jpg",
        title_highlighted = "Richard Lamb says he confident he can put together a <span class=\"ln-search-highlight\">business</span> plan to resurrect the Bradford Bulls in time for the new season.",
        title_original = "Richard Lamb says he confident he can put together a business plan to resurrect the Bradford Bulls in time for the new season.",
        transcripts_highlighted = listOf(""),
    ),
    Result(
        audio = "https://www.listennotes.com/e/p/486a2c0fd6904dbd9e3ee8f299da7c88/",
        audio_length = "00:08:29",
        description_highlighted = "...Richard Lamb says he is confident he can put together a business plan to resurrect the Bradford Bulls in time for the new season. #bradfordbulls #rugbyleague...",
        description_original = "Richard Lamb says he is confident he can put together a business plan to resurrect the Bradford Bulls in time for the new season. #bradfordbulls #rugbyleague",
        explicit_content = false,
        genres = listOf(68, 77, 78, 133),
        id = "486a2c0fd6904dbd9e3ee8f299da7c88",
        image = "https://cdn-images-1.listennotes.com/podcasts/proper-sport-daily-proper-sport-tXKjWYG3rLf.300x300.jpg",
        itunes_id = 1033504184,
        listennotes_url = "https://www.listennotes.com/e/486a2c0fd6904dbd9e3ee8f299da7c88/",
        podcast_id = "0175a31d45ec46f4b222edd19ea2929b",
        podcast_listennotes_url = "https://www.listennotes.com/c/0175a31d45ec46f4b222edd19ea2929b/",
        podcast_title_highlighted = "Proper Sport Mix Tape",
        podcast_title_original = "Proper Sport Mix Tape",
        pub_date_ms = 1483539198000,
        publisher_highlighted = "Proper Sport",
        publisher_original = "Proper Sport",
        rss = "https://audioboom.com/channels/3314883.rss",
        thumbnail = "https://cdn-images-1.listennotes.com/podcasts/proper-sport-daily-proper-sport-tXKjWYG3rLf.300x300.jpg",
        title_highlighted = "Richard Lamb says he confident he can put together a <span class=\"ln-search-highlight\">business</span> plan to resurrect the Bradford Bulls in time for the new season.",
        title_original = "Richard Lamb says he confident he can put together a business plan to resurrect the Bradford Bulls in time for the new season.",
        transcripts_highlighted = listOf(""),
    )
)