package com.example.myapplicationsaa.fragmm

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.myapplicationsaa.R

class Fragment3 : Fragment(R.layout.fragment3)  {
        private lateinit var addButton : Button
        private lateinit var editAdd : EditText
        private lateinit var textView: TextView
        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
             val sharedPreferences = requireActivity().getSharedPreferences("zuka" , Context.MODE_PRIVATE)
             val text = sharedPreferences.getString("Zuka" , "KKK")
             init()
             textView.text = text

            addButton.setOnClickListener{
                 var addnote = editAdd.text.toString()
                 var getnote= textView.text.toString()
                 var results = addnote  + "\n" +  getnote
                textView.text = results
                sharedPreferences.edit().putString("Zuka" , results).apply()

        }
    }

    private fun init(){
        addButton = requireView().findViewById(R.id.addButton)
        textView = requireView().findViewById(R.id.textView)
        editAdd = requireView().findViewById(R.id.editAdd)

    }

}



