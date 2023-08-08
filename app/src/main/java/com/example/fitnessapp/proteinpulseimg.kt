package com.example.fitnessapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class proteinpulseimg :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.proteinpulseimg)

        val multilineTextView = findViewById<TextView>(R.id.editTextTextMultiLine)
        multilineTextView.text = "Arhar Dal : 22 grams\n"+ "\nChana Dal (Split Chickpeas): 20 grams \n"+"\nMasoor Dal (Red Lentils): 24 grams\n"+
                "\nUrad Dal (Split Black Gram): 25 grams\n"+
                "\nMoong Dal (Split Mung Beans): 24 grams\n"+"\nRajma (Kidney Beans): 24 grams \n"+"\nToor Dal (Split Pigeon Peas): 22 grams\n"
    }
}