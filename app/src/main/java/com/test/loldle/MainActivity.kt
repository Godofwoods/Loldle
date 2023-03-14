package com.test.loldle


import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val classic = findViewById<Button>(R.id.Classic)
        classic.setOnClickListener {
            val intent = Intent(this, ClassicActivity::class.java)
            startActivity(intent)
        }
    }
}