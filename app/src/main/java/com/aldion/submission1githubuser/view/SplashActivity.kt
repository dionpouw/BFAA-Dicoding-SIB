package com.aldion.submission1githubuser.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aldion.submission1githubuser.MainActivity
import com.aldion.submission1githubuser.R
import kotlinx.coroutines.*


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        withCoroutine(1_500L)
    }

    private fun withCoroutine(delay: Long) {
        val mScope = CoroutineScope(Dispatchers.IO)
        mScope.launch {
            delay(delay)
            withContext(Dispatchers.Main) {
                launchPostSplashActivity()
                mScope.cancel(null)
            }
        }
    }

    private fun launchPostSplashActivity() {
        // launch another activity
        val intent = Intent(this@SplashActivity, MainActivity::class.java)
        startActivity(intent)
        finish() // necessary because we do not want user to come back to this activity
    }
}
