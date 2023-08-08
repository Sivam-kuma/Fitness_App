package com.example.fitnessapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class minerals:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.minerals)

        val navigateButton4: ImageView = findViewById(R.id.milkimg)
        navigateButton4.setOnClickListener {
            val intent = Intent(this, mineralmilkimg::class.java)
            startActivity(intent)
        }
        val navigateButton3: ImageView = findViewById(R.id.zincimg)
        navigateButton3.setOnClickListener {
            val intent = Intent(this, mineralzincimg::class.java)
            startActivity(intent)
        }
        val navigateButton2: ImageView = findViewById(R.id.elecimg)
        navigateButton2.setOnClickListener {
            val intent = Intent(this,mineralelectroliteimg::class.java)
            startActivity(intent)
        }
    }
}