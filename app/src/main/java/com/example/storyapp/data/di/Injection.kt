package com.example.storyapp.data.di

import android.content.Context
import com.example.storyapp.data.local.db.StoryDb
import com.example.storyapp.data.remote.api.ApiConfig
import com.example.storyapp.data.repository.StoryRepository

object Injection {
    fun provideRepository(context: Context): StoryRepository {
        val database = StoryDb.getDatabase(context)
        val apiService = ApiConfig.getApiService()
        return StoryRepository(database, apiService, context)
    }
}