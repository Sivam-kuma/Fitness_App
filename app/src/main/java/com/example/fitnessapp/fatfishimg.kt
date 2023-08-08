package com.example.fitnessapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class fatfishimg :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fatfishimg)

        val multilineTextView = findViewById<TextView>(R.id.editTextTextMultiLine)
        multilineTextView.text ="The amount of fat you get from fish can vary depending on the type of fish you consume. Generally, fish is known for being a good source of healthy fats, particularly omega-3 fatty acids.\n"+
                               "\nSalmon: 6-13 grams of fat\n"+"\nMackerel: 13-18 grams of fat\n"+"\nSardines: 10-15 grams of fat\n"+
                           "\nTrout: 2-6 grams of fat\n"+"\nTuna: 1-5 grams of fat\n"+"\nCod: 0.5-1 gram of fat\n"
    }
}