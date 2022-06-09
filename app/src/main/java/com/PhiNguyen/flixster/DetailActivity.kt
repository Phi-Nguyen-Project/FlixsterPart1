package com.PhiNguyen.flixster

import android.media.Rating
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.RatingBar
import android.widget.TextView

private const val YOUTUBE_API_KEY = "AIzaSyAsuzj12gk81r3b9pEIwHUJmd0RVqqvOoE"
private const val TAG = "DetailActivity"
class DetailActivity : AppCompatActivity() {

    private lateinit var tvTitle: TextView
    private lateinit var tvOverview: TextView
    private lateinit var ratingBar: RatingBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        tvTitle = findViewById(R.id.tvTitle)
        tvOverview = findViewById(R.id.tvOverview)
        ratingBar  = findViewById(R.id.rbVoteAverage)

        val movie = intent.getParcelableExtra<Movie>(MOVIE_EXTRA) as Movie

        tvTitle.text = movie.title
        tvOverview.text = movie.overview

        //rating bar
        ratingBar.rating = movie.voteAverage.toFloat()

    }
}