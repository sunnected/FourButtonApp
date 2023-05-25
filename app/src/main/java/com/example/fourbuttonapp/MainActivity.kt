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
        blue = findViewById(R.id.blue)
        yellow = findViewById(R.id.yellow)

        // onclick listener for all buttons
        red.setOnClickListener { changeColor(R.color.red) }
        green.setOnClickListener { changeColor(R.color.green) }
        blue.setOnClickListener { changeColor(R.color.blue) }
        yellow.setOnClickListener { changeColor(R.color.yellow) }
    }

    private fun changeColor(color: Int) {
        window.statusBarColor = getColor(color)
        constraintLayout.setBackgroundResource(color)
    }
}
