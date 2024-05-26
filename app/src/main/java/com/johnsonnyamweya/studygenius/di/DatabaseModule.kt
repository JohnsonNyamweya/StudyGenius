package com.johnsonnyamweya.studygenius.di

import android.app.Application
import androidx.room.Room
import com.johnsonnyamweya.studygenius.data.local.AppDatabase
import com.johnsonnyamweya.studygenius.data.local.SessionDao
import com.johnsonnyamweya.studygenius.data.local.SubjectDao
import com.johnsonnyamweya.studygenius.data.local.TaskDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(application: Application): AppDatabase{
        return Room
            .databaseBuilder(
                application,
                AppDatabase::class.java,
                "study_genius.db"
            )
            .build()
    }

    @Provides
    @Singleton
    fun provideSubjectDao(database: AppDatabase): SubjectDao{
        return database.subjectDao()
    }

    @Provides
    @Singleton
    fun provideTaskDao(database: AppDatabase): TaskDao{
        return database.taskDao()
    }

    @Provides
    @Singleton
    fun provideSessionDao(database: AppDatabase): SessionDao{
        return database.sessionDao()
    }
}