package com.example.fitnessapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class carbohydratehoneyimg :AppCompatActivity () {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.carbohydratehoneyimg)

        val multilineTextView = findViewById<TextView>(R.id.editTextTextMultiLine)
        multilineTextView.text ="One tablespoon (about 21 grams) of honey contains approximately 17 grams of carbohydrates. \n"+
                        "\nThe carbohydrates in honey primarily come from natural sugars, such as fructose and glucose. \n"+
                    "\nHoney is known for its high sugar content, and while it does provide quick energy due to its carbohydrate content.\n"
    }
}