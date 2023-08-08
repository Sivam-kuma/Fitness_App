package com.example.fitnessapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class carbohydratericeimg : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.carbohydratericeimg)

        val multilineTextView = findViewById<TextView>(R.id.editTextTextMultiLine)
        multilineTextView.text ="White Rice (short-grain, cooked): Around 28-29 grams of carbohydrates.\n"+"\nBrown Rice (medium-grain, cooked): Approximately 23-24 grams of carbohydrates.\n"+
                               "\nBasmati Rice (cooked): About 25 grams of carbohydrates.\n"+"\n Jasmine Rice (cooked): Roughly 28-29 grams of carbohydrates.\n"+
                               "\nWild Rice (cooked): Around 21 grams of carbohydrates.\n"

    }
}