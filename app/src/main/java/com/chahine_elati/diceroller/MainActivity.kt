package com.chahine_elati.diceroller

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollBtn: Button = findViewById(R.id.button)
        rollBtn.setOnClickListener {
            //val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
            rollDice()
        }

    }

    class Dice(private val numSides: Int) {
        fun roll(): Int{
            return (1..numSides).random()
        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        //val resultTextView: TextView = findViewById(R.id.textView)
        //resultTextView.text = diceRoll.toString()
    }

}