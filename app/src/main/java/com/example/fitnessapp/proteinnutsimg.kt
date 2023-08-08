package com.example.fitnessapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class proteinnutsimg :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.proteinnutsimg)

        val multilineTextView = findViewById<TextView>(R.id.editTextTextMultiLine)
        multilineTextView.text = "Almonds: 21 grams\n" +

                "\nPistachios: 20 grams\n" +

                "\nPeanuts: 25 grams\n" +

                "\nWalnuts: 15 grams\n" +

                "\nCashews: 18 grams\n" +

                "\nHazelnuts: 15 grams\n" +

                "\nPecans: 9 grams\n" +

                "\nMacadamia nuts: 9 grams\n" +

                "\nBrazil nuts: 14 grams\n" +

                "\nPine nuts: 14 grams"
    }
}