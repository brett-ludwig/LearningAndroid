package com.example.brett_ludwig.learningandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        val countUpButton: Button = findViewById(R.id.count_up_button)
        val resetButton: Button = findViewById(R.id.reset_button)
        // Uses fancy kotlin syntax to inline anon function (I'm pretty sure)
        // TODO: look into this more
        rollButton.setOnClickListener { rollDice() }
        countUpButton.setOnClickListener { countUp() }
        resetButton.setOnClickListener {reset() }
    }

    private fun rollDice(){
        val resultText: TextView = findViewById(R.id.result_text)
        val rollResult = (1..6).random()
        resultText.text = rollResult.toString()
    }

    private fun countUp(){
        val resultText: TextView = findViewById(R.id.result_text)
        if (resultText.text.toString() == "Hello World"){
            resultText.text = 1.toString()
        }else{
            // converts string to int and then increments it
            resultText.text = (resultText.text.toString().toInt() + 1).toString()
        }
    }

    private fun reset(){
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = 0.toString()
    }
}
