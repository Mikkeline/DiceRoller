package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRoll: Button = findViewById(R.id.roll_btn)

        btnRoll.setOnClickListener {
            rollDice()

            //Toast.makeText(this, "Button is click", Toast.LENGTH_LONG).show()
        }
    }

        fun rollDice(){

            val randomInt = (1..6).random()

            val txtResult: TextView = findViewById(R.id.result_txt)

            txtResult.text = randomInt.toString()
        }
    
}