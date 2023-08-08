package com.example.fitnessapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class fatyougertimg :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fatyogurtimg)

        val multilineTextView = findViewById<TextView>(R.id.editTextTextMultiLine)
        multilineTextView.text ="The fat content in 100 grams of yogurt can vary depending on the type of yogurt.\n"+"\nRegular, full-fat yogurt: 3-10 grams of fat\n"+
                                "\nLow-fat yogurt: 0.4-3 grams of fat\n"+"\nNon-fat or fat-free yogurt: Less than 0.5 grams of fat\n"
    }
}