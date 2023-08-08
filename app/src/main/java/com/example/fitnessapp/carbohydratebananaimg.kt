package com.example.fitnessapp

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class carbohydratebananaimg : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.carbohydratebananaimg)

        val multilineTextView = findViewById<TextView>(R.id.editTextTextMultiLine)
        multilineTextView.text ="On average, a medium-sized banana (approximately 7-8 inches long) contains about 27-30 grams of carbohydrates.\n"+
                                "\nThe majority of the carbohydrates in a banana come from natural sugars such as glucose, fructose, and sucrose, which provide a quick source of energy. \n"+
                             "\nBananas also contain dietary fiber, which contributes to the total carbohydrate content.\n"
    }
}