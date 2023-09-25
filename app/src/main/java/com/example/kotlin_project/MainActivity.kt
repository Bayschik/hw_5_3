package com.example.kotlin_project

import android.content.Intent
import android.media.tv.TvView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var number = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val plusButton:Button = findViewById(R.id.plus_button)
        val nextActivity:Button = findViewById(R.id.next_activity)
        val minusButton:Button = findViewById(R.id.minus_button)
        val resultText:TextView = findViewById(R.id.result_text)

        plusButton.setOnClickListener {
            number++
            resultText.text = number.toString()
            if (resultText.text.equals("10")){
                minusButton.visibility = View.VISIBLE
                plusButton.visibility = View.GONE
            }
        }

        minusButton.setOnClickListener {
            if(resultText.text.toString() > 0.toString()){
                number--
                resultText.text = number.toString()
            }
        }

        nextActivity.setOnClickListener{
            if (resultText.text.equals("0")) {
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("key", resultText.text.toString())
                startActivity(intent)
            }
        }
    }
}