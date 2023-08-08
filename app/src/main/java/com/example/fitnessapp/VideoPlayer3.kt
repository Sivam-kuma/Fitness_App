package com.example.fitnessapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer


import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView

class VideoPlayer3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tricepsvideo)

        // Get the YouTubePlayerView from the layout
        val youTubePlayerView: YouTubePlayerView = findViewById(R.id.youtube_player_view)

        // Add the YouTubePlayerView as a lifecycle observer of this activity
        lifecycle.addObserver(youTubePlayerView)

        // Initialize the YouTubePlayerView with a listener
        youTubePlayerView.initialize(object : AbstractYouTubePlayerListener() {
            override fun onReady(youTubePlayer: YouTubePlayer) {
                // Load the video with the given ID
                val videoId = "rzTapF3new8"
                youTubePlayer.loadVideo(videoId, 0f)
            }
        }, true)
    }
}