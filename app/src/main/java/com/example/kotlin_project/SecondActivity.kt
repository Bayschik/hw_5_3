package com.example.kotlin_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textFromMain:TextView = findViewById(R.id.second_activity_text)
        val receiveData = intent.getStringExtra("key")
        textFromMain.text = receiveData.toString()
    }
}