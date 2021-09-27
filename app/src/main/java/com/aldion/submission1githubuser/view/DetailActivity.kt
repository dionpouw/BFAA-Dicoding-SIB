package com.aldion.submission1githubuser.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aldion.submission1githubuser.R

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_PERSON = "extra_person"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
    }
}