package com.example.fitnessapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class vitamindimg :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.vitaminedimg)

        val multilineTextView = findViewById<TextView>(R.id.editTextTextMultiLine)
        multilineTextView.text ="Fatty Fish: Fish such as salmon, mackerel, sardines, and trout are excellent natural sources of vitamin D.\n"+
                               "\nCod Liver Oil: Cod liver oil is rich in vitamin D and can be consumed as a supplement or used in cooking.\n"+
                              "\nEgg Yolks: Egg yolks contain small amounts of vitamin D. Including eggs in your diet can contribute to your vitamin D intake.\n"+
                              "\nMushrooms: Certain varieties of mushrooms, such as shiitake and maitake, can naturally produce vitamin D when exposed to sunlight or ultraviolet (UV) light. \n"+
                                "\n"
    }
}