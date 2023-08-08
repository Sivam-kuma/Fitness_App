package com.example.fitnessapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class proteinvegimg :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.proteinvegimg)

        val multilineTextView = findViewById<TextView>(R.id.editTextTextMultiLine)
        multilineTextView.text = "Green Peas: 6 grams\n"+ "\nSpinach: 6 grams\n"+"\nCorn:5 grams\n"+
                                 "\nAvocado : 5 grams\n"+"\nPotato :3 grams\n"+"\nMushrooms : 4 grams\n"+
                                 "\nAsparagus : 4.3 grams\n"+"\nKale : 3.5 grams\n"+"\nArtichokes : 5 grams\n"
    }
}