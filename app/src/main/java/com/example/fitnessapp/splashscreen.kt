package com.example.fitnessapp

import android.content.Context
import android.content.ContextParams
import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.os.Handler
import android.util.AttributeSet
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class splashscreen:AppCompatActivity() {

    private val splashDelay: Long = 1000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.splashscreen)

        Handler().postDelayed({
            val intent = Intent(this, HOME::class.java)
            startActivity(intent)
            finish()
        }, splashDelay)
    }
}