package com.aldion.submission1githubuser.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aldion.submission1githubuser.MainActivity
import com.aldion.submission1githubuser.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val intent = Intent(this@SplashActivity,MainActivity::class.java)
        startActivity(intent)
    }
}