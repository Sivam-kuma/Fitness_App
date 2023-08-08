package com.example.fitnessapp

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment

class fragment2nut : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment2nut, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        showToast("Click Bottons for detail")



        val button = view.findViewById<Button>(R.id.protein)
        button.setOnClickListener {
            val intent = Intent(requireContext(), protein::class.java)
            startActivity(intent)
        }


            val button2 = view.findViewById<Button>(R.id.carbohydrate)
            button2.setOnClickListener {
                val intent = Intent(requireContext(), carbohydrate::class.java)
                startActivity(intent)
            }

        val button3 = view.findViewById<Button>(R.id.fat)
        button3.setOnClickListener {
            val intent = Intent(requireContext(), fat::class.java)
            startActivity(intent)
        }
        val button4 = view.findViewById<Button>(R.id.Minerals)
        button4.setOnClickListener {
            val intent = Intent(requireContext(), minerals::class.java)
            startActivity(intent)
        }
        val button5 = view.findViewById<Button>(R.id.Vitamins)
        button5.setOnClickListener {
            val intent = Intent(requireContext(), vitamines::class.java)
            startActivity(intent)
        }
        }

        private fun showToast(message: String) {
            Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
        }
    }



