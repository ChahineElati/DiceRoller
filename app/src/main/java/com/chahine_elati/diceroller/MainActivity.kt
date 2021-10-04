package com.chahine_elati.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
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
        rollDice()

    }

    class Dice(private val numSides: Int) {
        fun roll(): Int{
            return (1..numSides).random()
        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val diceImage: ImageView = findViewById(R.id.dice_image)
        val diceImageResult = when(diceRoll) {
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            else-> R.drawable.dice_6
        }
        diceImage.setImageResource(diceImageResult)
    }
}