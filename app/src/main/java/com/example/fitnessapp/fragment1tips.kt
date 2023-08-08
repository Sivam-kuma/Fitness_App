package com.example.fitnessapp

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.resources.Compatibility.Api21Impl.inflate
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import androidx.fragment.app.Fragment
import java.util.zip.Inflater


class fragment1tips : Fragment() {

   // override fun onCreate(savedInstanceState: Bundle?) {
    //    super.onCreate(savedInstanceState)
    //    setContentView(R.layout.home)
     override fun onCreateView(
      inflater: LayoutInflater,
      container: ViewGroup?,
     // setContentView(R.layout.home)
      savedInstanceState: Bundle?
    ): View? {

      return inflater.inflate(R.layout.fragment1tips,container,false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button = view.findViewById<Button>(R.id.button1_1)
        button.setOnClickListener {
            val intent = Intent(requireContext(),VideoPlayer::class.java)
            startActivity(intent)
        }
        val button2 = view.findViewById<Button>(R.id.button1_2)
        button2.setOnClickListener {
            val intent = Intent(requireContext(),VideoPlayer2::class.java)
            startActivity(intent)
        }
        val button3 = view.findViewById<Button>(R.id.button1_3)
        button3.setOnClickListener {
            val intent = Intent(requireContext(),VideoPlayer3::class.java)
            startActivity(intent)
        }
        val button4 = view.findViewById<Button>(R.id.button2_1)
        button4.setOnClickListener {
            val intent = Intent(requireContext(),VideoPlayer4::class.java)
            startActivity(intent)
        }
        val button5 = view.findViewById<Button>(R.id.button2_2)
        button5.setOnClickListener {
            val intent = Intent(requireContext(),VideoPlayer5::class.java)
            startActivity(intent)
        }
        val button6 = view.findViewById<Button>(R.id.button2_3)
        button6.setOnClickListener {
            val intent = Intent(requireContext(),VideoPlayer6::class.java)
            startActivity(intent)
        }
        val button7 = view.findViewById<Button>(R.id.button2_4)
        button7.setOnClickListener {
            val intent = Intent(requireContext(),VideoPlayer7::class.java)
            startActivity(intent)
        }
    }
}
