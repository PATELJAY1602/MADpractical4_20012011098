package com.example.madpractical4_20012011098

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val button2 =findViewById<Button>(R.id.button_new2)
        val  intent = intent
        val id = intent.getStringArrayExtra("")
    }
}