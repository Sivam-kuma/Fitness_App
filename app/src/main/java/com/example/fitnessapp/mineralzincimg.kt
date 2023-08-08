package com.example.fitnessapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class mineralzincimg:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mineralzincimg)
        val multilineTextView = findViewById<TextView>(R.id.editTextTextMultiLine)
        multilineTextView.text ="Vegetables: Some vegetables also contain zinc, although in smaller quantities compared to animal-based sources. Examples include spinach, mushrooms, and potatoes.\n"+
                          "\nDairy Products: Dairy products like milk, cheese, and yogurt contain moderate levels of zinc. Paneer, a type of Indian cottage cheese, is a popular dairy product in India.\n"+
                           "\nNuts and Seeds: Pumpkin seeds, sesame seeds, and flaxseeds are rich in zinc. Almonds and cashews also provide smaller amounts of zinc.\n"+
                            "\nLegumes: Legumes like chickpeas (garbanzo beans), lentils, kidney beans, and black-eyed peas are good sources of zinc. These legumes are commonly used in Indian cuisine in dishes such as chole (chickpea curry) and rajma (kidney bean curry).\n"+
                             "\nShellfish: Shellfish such as crab, shrimp, and mussels are good sources of zinc and are commonly used in coastal regions of India.\n"
    }
}