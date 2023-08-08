package com.example.fitnessapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class carbohydratepotatoimg:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.carbohydratepotatoimg)


        val multilineTextView = findViewById<TextView>(R.id.editTextTextMultiLine)
        multilineTextView.text ="On average, a medium-sized potato (about 150 grams) contains approximately 30-35 grams of carbohydrates.\n"+
                              "\n Potatoes also contain a small amount of dietary fiber, which contributes to the total carbohydrate content.\n"+
                            "\n Potatoes also contain a small amount of dietary fiber, which contributes to the total carbohydrate content.\n"+
                            "\nIt's important to note that the carbohydrate content can vary slightly depending on the specific type of potato and how it is prepared (e.g., boiled, baked, mashed).\n"
    }
}