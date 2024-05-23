package com.example.storyapp.view

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.storyapp.data.local.User
import com.example.storyapp.data.repository.StoryRepository

class SplashViewModel(private val repository: StoryRepository) : ViewModel() {

    fun getUser(): LiveData<User> = repository.getUser()

}