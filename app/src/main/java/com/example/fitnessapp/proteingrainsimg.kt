package com.example.fitnessapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class proteingrainsimg : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.proteingrainsimg)

        val multilineTextView = findViewById<TextView>(R.id.editTextTextMultiLine)
        multilineTextView.text = "Wild Rice : 15 grams\n"+ "\nSpelt: 15 grams \n"+"\nKamut : 14 grams\n"+
                "\nQuinoa : 14 grams\n"+"\nBuckwheat : 11 grams\n"+"\nTEFF : 14 grams\n"+"\nRolled Oats : 14 grams\n"+"\nSorghum : 10 grams\n"+
                "\nAmaranth : 13.7 grams\n"+"\nBrown Rice: 8 grams \n"+"\nMillet : 11 grams\n"
    }
}