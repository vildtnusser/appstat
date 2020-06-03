package com.google.app1


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast
import android.util.Log
import android.view.View
import android.widget.TextView

class madScreen : AppCompatActivity() {
    //lateinit var btn_click_me : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.madscreen)

        // get reference to button
        val btn_Left = findViewById(R.id.mad_left) as Button
        val btn_Right = findViewById(R.id.mad_right) as Button
        val btn_Bottle = findViewById(R.id.mad_bottle) as Button
        val btn_Meal = findViewById(R.id.mad_meal) as Button

        val intentName = intent
        val name = intentName.getStringExtra("Name")
        val babyName = findViewById<TextView>(R.id.mad_name1)
        babyName.text = name

        // set on-click listener
        btn_Left.setOnClickListener{
            val intentLeft : Intent = Intent(this@madScreen, madLeftScreen_Timer:: class.java)
            intentLeft.putExtra("Name",babyName.text.toString())
            startActivity(intentLeft)
        }

        btn_Right.setOnClickListener{
            val intentRight : Intent = Intent(this@madScreen, madRightScreen_Timer:: class.java)
            intentRight.putExtra("Name",babyName.text.toString())
            startActivity(intentRight)
        }

        btn_Bottle.setOnClickListener{
            val intentBottle : Intent = Intent(this@madScreen, madBottleScreen_Timer:: class.java)
            intentBottle.putExtra("Name",babyName.text.toString())
            startActivity(intentBottle)

        }

        btn_Meal.setOnClickListener{
            val intentMeal : Intent = Intent(this@madScreen, madMealScreen:: class.java)
            intentMeal.putExtra("Name",babyName.text.toString())
            startActivity(intentMeal)
        }
        // your code to perform when the user clicks on the button
        //Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
        //}
    }
}
