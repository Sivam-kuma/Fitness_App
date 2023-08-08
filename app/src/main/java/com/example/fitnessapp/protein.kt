package com.example.fitnessapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class protein: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.protein)

        val imageView = findViewById<ImageView>(R.id.nutsimg)
        setRoundedCorner(imageView)

        val navigateButton: ImageView = findViewById(R.id.nutsimg)
        navigateButton.setOnClickListener {
            val intent = Intent(this, proteinnutsimg::class.java)
            startActivity(intent)
        }
        val navigateButton1: ImageView = findViewById(R.id.vegiesimg)
        navigateButton1.setOnClickListener {
            val intent = Intent(this, proteinvegimg::class.java)
            startActivity(intent)
        }
        val navigateButton2: ImageView = findViewById(R.id.pulseimg)
        navigateButton2.setOnClickListener {
            val intent = Intent(this, proteinpulseimg::class.java)
            startActivity(intent)
        }
        val navigateButton3: ImageView = findViewById(R.id.grainsimg)
        navigateButton3.setOnClickListener {
            val intent = Intent(this, proteingrainsimg::class.java)
            startActivity(intent)
        }
        val navigateButton4: ImageView = findViewById(R.id.eggimg)
        navigateButton4.setOnClickListener {
            val intent = Intent(this, proteineggimg::class.java)
            startActivity(intent)
        }
    }
}