package com.example.storyapp.view

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.storyapp.data.repository.StoryRepository

class MapsViewModel(private val repository: StoryRepository) : ViewModel() {

    fun getStory() = repository.getStoryWithLocation().asLiveData()
}