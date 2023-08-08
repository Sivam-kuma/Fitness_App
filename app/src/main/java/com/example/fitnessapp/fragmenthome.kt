package com.example.fitnessapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainer
//making class for fragment//
class fragmenthome : Fragment() {
    //overriding onCreateView function//

    private lateinit var heightInput: EditText
    private lateinit var weightInput: EditText
    private lateinit var calculateButton: Button
    private lateinit var resultLabel: TextView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragmenthome,container,false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        heightInput = view.findViewById(R.id.heightInput)
        weightInput = view.findViewById(R.id.weightInput)
        calculateButton = view.findViewById(R.id.calculateButton)
        resultLabel = view.findViewById(R.id.resultLabel)

        calculateButton.setOnClickListener {
            calculateBMI()
        }

    }


private fun calculateBMI() {
    val heightFeet = heightInput.text.toString().toFloat()
    val weightKg = weightInput.text.toString().toFloat()

    val heightMeter = heightFeet * 0.3048f
    val bmi = weightKg / (heightMeter * heightMeter)

    val bmiLabel = when {
        bmi < 18.5f -> "Underweight"
        bmi < 24.9f -> "Normal Weight"
        bmi < 29.9f -> "Overweight"
        else -> "Obese"
    }

    resultLabel.text = "BMI: %.2f\n%s".format(bmi, bmiLabel)
    resultLabel.visibility = View.VISIBLE
}
}