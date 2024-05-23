package com.example.storyapp.activity

import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.example.storyapp.R
import com.example.storyapp.data.remote.response.ListStoryItem
import com.example.storyapp.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupAction()
        title = getString(R.string.detail_story)
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.color.red))
    }

    private fun setupAction() {
        val item = intent.getParcelableExtra<ListStoryItem>(MainActivity.EXTRA_STORY)
        binding.apply {
            tvName.text = item?.name
            tvDescription.text = item?.description

            Glide.with(this@DetailActivity).load(item?.photoUrl).into(ivStory)
        }
    }
}
