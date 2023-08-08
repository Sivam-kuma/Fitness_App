package com.example.fitnessapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class fatchocolateimg:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fatchocolateimg)
        val multilineTextView = findViewById<TextView>(R.id.editTextTextMultiLine)
        multilineTextView.text ="The amount of fat in 100 grams of chocolate can vary depending on the type of chocolate and its ingredients.\n"+
                        "\nDark Chocolate (70-85% cocoa content): 30-40 grams of fat\n"+"\nMilk Chocolate: 30-40 grams of fat\n"+
                     "\nWhite Chocolate: 31-36 grams of fat\n"
    }
}