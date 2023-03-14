package com.test.loldle


import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.inputmethod.EditorInfo
import android.widget.EditText

class ClassicActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.classic)


        val editText = findViewById<EditText>(R.id.editText)
        val champName = "Aatrox"
        editText.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                Log.v("ClassicActivity", "Done button pressed")
                val text = editText.text.toString().lowercase()
            if (text == champName.lowercase()){
                editText.clearFocus()
                Log.v("ClassicActivity", "Correct")
                editText.setText("")
            } else {
                editText.clearFocus()
                Log.v("ClassicActivity", "Wrong")
                editText.setText("")
        }
            }
            false
        }
        editText.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                Log.v("ClassicActivity", "Focus lost")
            }
        }


    }
}