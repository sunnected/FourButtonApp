package com.example.fourbuttonapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    private lateinit var constraintLayout: ConstraintLayout
    private lateinit var red: Button
    private lateinit var green: Button
    private lateinit var blue: Button
    private lateinit var yellow: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // finding ids
        constraintLayout = findViewById(R.id.constraintLayout)
        red = findViewById(R.id.red)
        green = findViewById(R.id.green)
        blue = findViewById(R.id.black)
        yellow = findViewById(R.id.yellow)

        // onclick listener for red
        red.setOnClickListener {
            constraintLayout.setBackgroundResource(R.color.red)

        }

        // onclick listener for red
        green.setOnClickListener { constraintLayout.setBackgroundResource(R.color.green) }

        // onclick listener for red
        blue.setOnClickListener { constraintLayout.setBackgroundResource(R.color.blue) }

        // onclick listener for red
        yellow.setOnClickListener { constraintLayout.setBackgroundResource(R.color.yellow) }

    }
}