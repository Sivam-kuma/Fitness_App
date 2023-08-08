package com.example.fitnessapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class vitamincimg :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.vitaminecimg)

        val multilineTextView = findViewById<TextView>(R.id.editTextTextMultiLine)
        multilineTextView.text ="Indian Gooseberry (Amla): Amla is considered one of the richest sources of vitamin C. It can be consumed raw, in juice form, or as a part of pickles and chutneys.\n"+
                       "\nLemons: Lemons are highly acidic citrus fruits that are widely used in Indian cuisine. They are not only rich in vitamin C but also add a tangy flavor to dishes and beverages.\n"+
                       "\nKiwi: Kiwi is a fuzzy fruit that is packed with vitamin C. It can be enjoyed fresh, added to fruit salads, or used in smoothies.\n"+
                         "\nOranges: Oranges are citrus fruits rich in vitamin C. They can be consumed as a fruit, squeezed for juice, or added to salads and desserts.\n"+
                        "\nOranges: Oranges are citrus fruits rich in vitamin C. They can be consumed as a fruit, squeezed for juice, or added to salads and desserts.\n"
    }
}