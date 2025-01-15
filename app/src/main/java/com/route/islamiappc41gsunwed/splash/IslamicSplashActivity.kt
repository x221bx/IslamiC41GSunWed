package com.route.islamiappc41gsunwed.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.route.islamiappc41gsunwed.R
import com.route.islamiappc41gsunwed.home.HomeActivity

class IslamicSplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_islamic_splash)
        Handler(Looper.getMainLooper()).postDelayed({
            openHomeScreen()
        }, 2500)
    }

    private fun openHomeScreen() {
        val intent = Intent(this@IslamicSplashActivity, HomeActivity::class.java)
        startActivity(intent)
        finish()
    }
}