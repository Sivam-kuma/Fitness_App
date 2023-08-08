package com.example.fitnessapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class proteineggimg : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.proteineggimg)

        val multilineTextView = findViewById<TextView>(R.id.editTextTextMultiLine)
        multilineTextView.text ="On average, a large egg contains about 6 grams of protein.\n"+"\nThe protein content of an egg can vary slightly depending on its size.\n"+
                                 "\nThe majority of the protein is found in the egg white, while the yolk contains smaller amounts of protein along with other nutrients such as fat and cholesterol.\n"+
                           " \nIt's worth noting that the protein content of an egg can be influenced by factors such as the hen's diet and overall health."
    }
}