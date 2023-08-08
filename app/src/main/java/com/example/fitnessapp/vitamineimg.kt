package com.example.fitnessapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class vitamineimg:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.vitaminecimg)

        val multilineTextView = findViewById<TextView>(R.id.editTextTextMultiLine)
        multilineTextView.text ="Mangoes: Mangoes, the beloved tropical fruit in India, also provide vitamin E along with other nutrients. They can be enjoyed fresh or used in smoothies, desserts, and chutneys.\n" +
                "\nWheat Germ: Wheat germ is the nutrient-rich inner part of wheat kernels. It is a concentrated source of vitamin E and can be sprinkled on cereals, yogurt, or used in baking.\n"+
                "\nSpinach: Spinach is a leafy green vegetable that contains vitamin E along with other beneficial nutrients. It can be used in salads, sautéed as a side dish, or added to soups and curries.\n"+
                "\nAvocado: Avocado is a creamy fruit that provides a good amount of vitamin E. It can be enjoyed as guacamole, added to salads, or used as a healthy fat in various recipes.\n"+
                  "\nPumpkin Seeds: Pumpkin seeds are a nutritious snack that contains vitamin E. They can be roasted and enjoyed as a snack or added to trail mixes and baked goods.\n"
    }
}