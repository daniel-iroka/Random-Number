package com.daniel.randomizer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Here we use findViewById to initialize the views in our layout to the new variables to use them
        val rollButtonVariable = findViewById<Button>(R.id.rollButton)
        val seekBarVariable = findViewById<SeekBar>(R.id.seekBar)
        val resultTextViewVariable = findViewById<TextView>(R.id.resultTextView)
        val checkTextViewVariable = findViewById<TextView>(R.id.checkTextView)

        // The setOnClickListener basically works with a button
        // Here(inside the curly braces) we specify what will happen to our button when we click it

        rollButtonVariable.setOnClickListener {

            // This here generates a random number starting from zero from within a certain range depending on the value of the seekBar
            // and under it assigns the Random Number to the resultTextView in form of text because we converted it toString()
            val rand = Random().nextInt(seekBarVariable.progress)
            resultTextViewVariable.text = rand.toString()

            // If and else for checking a Special Number
            if (rand == 5) {
                checkTextViewVariable.text = "Congrats! You got a special Number 5"
            }
        }
    }
}

/**
 *  Our 3 views are Button, a TextView to ask how many, a seekBar which acts as a selector and finally
 *  a TextView to display the random Number
 *  Also a TextView to display the congratulatory message after checking the rand for 5
 * **/