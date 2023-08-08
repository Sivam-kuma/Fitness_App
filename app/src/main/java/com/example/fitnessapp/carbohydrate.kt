package com.example.fitnessapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class carbohydrate : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.carbohydrate)

        val navigateButton1: ImageView = findViewById(R.id.milkimg)
        navigateButton1.setOnClickListener {
            val intent = Intent(this, carbohydratericeimg::class.java)
            startActivity(intent)
        }

        val navigateButton2: ImageView = findViewById(R.id.zincimg)
        navigateButton2.setOnClickListener {
            val intent = Intent(this, carbohydratebananaimg::class.java)
            startActivity(intent)
        }
        val navigateButton3: ImageView = findViewById(R.id.honeyimg)
        navigateButton3.setOnClickListener {
            val intent = Intent(this, carbohydratehoneyimg::class.java)
            startActivity(intent)
        }
        val navigateButton4: ImageView = findViewById(R.id.elecimg)
        navigateButton4.setOnClickListener {
            val intent = Intent(this, carbohydratepotatoimg::class.java)
            startActivity(intent)
        }
    }
}