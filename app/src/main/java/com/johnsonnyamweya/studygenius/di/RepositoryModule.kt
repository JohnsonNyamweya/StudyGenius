package com.johnsonnyamweya.studygenius.di

import com.johnsonnyamweya.studygenius.data.repository.SessionRepositoryImpl
import com.johnsonnyamweya.studygenius.data.repository.SubjectRepositoryImpl
import com.johnsonnyamweya.studygenius.data.repository.TaskRepositoryImpl
import com.johnsonnyamweya.studygenius.domain.repository.SessionRepository
import com.johnsonnyamweya.studygenius.domain.repository.SubjectRepository
import com.johnsonnyamweya.studygenius.domain.repository.TaskRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Singleton
    @Binds
    abstract fun bindSubjectViewModel(
        impl: SubjectRepositoryImpl
    ): SubjectRepository

    @Singleton
    @Binds
    abstract fun bindTaskViewModel(
        impl: TaskRepositoryImpl
    ): TaskRepository

    @Singleton
    @Binds
    abstract fun bindSessionViewModel(
        impl: SessionRepositoryImpl
    ): SessionRepository
}