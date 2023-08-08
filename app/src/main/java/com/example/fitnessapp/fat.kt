package com.example.fitnessapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class fat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fat)

        val navigateButton1: ImageView = findViewById(R.id.fishimg)
        navigateButton1.setOnClickListener {
            val intent = Intent(this, fatfishimg::class.java)
            startActivity(intent)
        }

        val navigateButton2: ImageView = findViewById(R.id.chocolateimg)
        navigateButton2.setOnClickListener {
            val intent = Intent(this, fatchocolateimg::class.java)
            startActivity(intent)
        }
        val navigateButton3: ImageView = findViewById(R.id.flaximg)
        navigateButton3.setOnClickListener {
            val intent = Intent(this, fatflaximg::class.java)
            startActivity(intent)
        }
        val navigateButton4: ImageView = findViewById(R.id.yougertimg)
        navigateButton4.setOnClickListener {
            val intent = Intent(this, fatyougertimg::class.java)
            startActivity(intent)
        }
    }
}