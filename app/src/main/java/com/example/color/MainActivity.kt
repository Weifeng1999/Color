package com.example.color

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun makeColored(view: View) {
        when (view.id) {
            // Boxes using Color class colors for the background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_six_text -> view.setBackgroundColor(Color.CYAN)
            R.id.box_eleven_text -> view.setBackgroundColor(Color.BLACK)
            R.id.box_twelve_text -> view.setBackgroundColor(Color.RED)
            R.id.box_thirteen_text -> view.setBackgroundColor(Color.YELLOW)
            R.id.box_fourteen_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_fifteen_text -> view.setBackgroundColor(Color.GREEN)
            R.id.box_sixteen_text -> view.setBackgroundColor(Color.MAGENTA)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

    private fun setListeners() {

        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)
        val boxSixText = findViewById<TextView>(R.id.box_six_text)
        val boxElevenText = findViewById<TextView>(R.id.box_eleven_text)
        val boxTwelveText = findViewById<TextView>(R.id.box_twelve_text)
        val boxThirteenText = findViewById<TextView>(R.id.box_thirteen_text)
        val boxFourteenText = findViewById<TextView>(R.id.box_fourteen_text)
        val boxFifteenText = findViewById<TextView>(R.id.box_fifteen_text)
        val boxSixteenText = findViewById<TextView>(R.id.box_sixteen_text)

        val diceImage = findViewById<ImageView>(R.id.image_1)
        diceImage.setImageResource(R.drawable.dice_1)

        val diceImage2 = findViewById<ImageView>(R.id.image_2)
        diceImage2.setImageResource(R.drawable.dice_2)

        val diceImage3 = findViewById<ImageView>(R.id.image_3)
        diceImage3.setImageResource(R.drawable.dice_3)

        val diceImage4 = findViewById<ImageView>(R.id.image_4)
        diceImage4.setImageResource(R.drawable.dice_4)

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)

        val clickableViews: List<View> =
            listOf(boxOneText, boxTwoText, boxThreeText,
                boxFourText, boxFiveText, boxSixText, boxElevenText, boxTwelveText,
                boxThirteenText, boxFourteenText, boxFifteenText, boxSixteenText, rootConstraintLayout)

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }

}
