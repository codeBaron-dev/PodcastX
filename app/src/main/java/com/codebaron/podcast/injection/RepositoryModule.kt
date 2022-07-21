package com.codebaron.podcast.injection

import com.codebaron.podcast.repository.ApiEndPoint
import com.codebaron.podcast.repository.PodcastRepository
import com.codebaron.podcast.repository.PodcastRepositoryImplementation
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module @InstallIn(SingletonComponent::class)
class RepositoryModule {
    @Provides
    @Singleton
    fun providerNewsRepository(provider: ApiEndPoint): PodcastRepository =
        PodcastRepositoryImplementation(provider)
}