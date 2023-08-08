package com.example.fitnessapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class mineralelectroliteimg:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mineralelectroliteimg)
        val multilineTextView = findViewById<TextView>(R.id.editTextTextMultiLine)
        multilineTextView.text ="Bananas: Bananas are a great source of potassium, which is an essential electrolyte. They are easily available and can be consumed as a snack or added to smoothies.\n"+
                                    "\nCoconut: Apart from coconut water, the flesh of the coconut itself is a good source of electrolytes, particularly potassium. It can be consumed fresh or used in various recipes.\n"+
                         "\nYogurt: Plain yogurt or curd is a good source of potassium, calcium, and magnesium. It can be consumed on its own or used in recipes like raita (yogurt-based side dish) or lassi \n"+
                       "\nWatermelon: Watermelon is not only hydrating but also contains electrolytes like potassium and magnesium. It is a refreshing fruit to consume during hot weather.\n"+
                       "\nOranges: Oranges are rich in vitamin C, as well as electrolytes like potassium and magnesium. They can be eaten as a fruit or consumed as fresh orange juice.\n"
    }
}