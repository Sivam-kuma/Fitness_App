package com.example.fitnessapp

import android.os.Bundle
import android.text.Editable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment

class fragment3own : Fragment(){

    private lateinit var editText: EditText
    private lateinit var saveButton: Button
    private lateinit var databaseHelper: DatabaseHelper
   override fun onCreateView(
      inflater: LayoutInflater,
       container: ViewGroup?,
       savedInstanceState: Bundle?
    ): View? {
       return inflater.inflate(R.layout.fragment3own, container, false)
   }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       editText = view.findViewById(R.id.editText)
       saveButton = view.findViewById(R.id.saveButton)
       databaseHelper = DatabaseHelper(requireContext())

        val savedText = databaseHelper.getSavedInput() // Retrieve saved text from the database
        editText.setText(savedText)

      //  val multilineTextView = view.findViewById<EditText>(R.id.editText)//
      //  multilineTextView.text = Editable.Factory.getInstance().newEditable("")//




        saveButton.setOnClickListener {
           val inputText = editText.text.toString()
           if (inputText.isNotEmpty()) {
               databaseHelper.insertInput(inputText)

               Toast.makeText(requireContext(), "Input saved to database", Toast.LENGTH_SHORT).show()
           }
       }


   }






    }



