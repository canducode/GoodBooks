package com.submission.goodbooks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    companion object {
        private const val SPLASHTIMEOUT: Long = 3000
    }

    @Suppress("DEPRECATION")
    private val handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        handler.postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        },SPLASHTIMEOUT)
    }
}