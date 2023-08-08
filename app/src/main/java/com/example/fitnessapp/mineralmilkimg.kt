package com.example.fitnessapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class mineralmilkimg :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mineralmilkimg)

        val multilineTextView = findViewById<TextView>(R.id.editTextTextMultiLine)
        multilineTextView.text ="approximate range of mineral content in 1 liter (1000 ml) of cow's milk:\n"+
                             "\nCalcium: 1200-1300 mg\n"+"\nPhosphorus: 900-1000 mg\n"+"\nPotassium: 1300-1400 mg\n"+"\nMagnesium: 100-120 mg\n"+
                             "\nZinc: 3-4 mg\n"+"\nSelenium: 10-15 μg\n"
    }
}