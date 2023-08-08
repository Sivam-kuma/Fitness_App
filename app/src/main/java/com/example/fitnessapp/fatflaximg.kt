package com.example.fitnessapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class fatflaximg :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fatflaximg)

        val multilineTextView = findViewById<TextView>(R.id.editTextTextMultiLine)
        multilineTextView.text ="In 100 grams of flaxseeds, there is approximately 42 grams of fat.\n"+"\n Flaxseeds are known for their high fat content, which primarily consists of healthy fats such as omega-3 fatty acids, omega-6 fatty acids, and monounsaturated fats.\n"+
                              "\nIt's important to note that flaxseeds also contain a significant amount of dietary fiber, which can contribute to a healthy digestive system.\n"
    }
}