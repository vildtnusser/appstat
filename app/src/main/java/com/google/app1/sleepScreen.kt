package com.google.app1


import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast
import android.util.Log
import android.view.View
import android.widget.TextView

class sleepScreen : AppCompatActivity() {
    //lateinit var btn_click_me : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sleepscreen)

        val intentName = intent
        val name = intentName.getStringExtra("Name")
        val babyName = findViewById<TextView>(R.id.sleep_navn1)
        babyName.text = name

        // get reference to button
        val btn_Left = findViewById(R.id.sleep_left1) as Button
        val btn_Right = findViewById(R.id.sleep_right1) as Button

        // set on-click listener
        btn_Left.setOnClickListener{
            val intentLeft : Intent = Intent(this@sleepScreen, sleepLeftScreen_Timer:: class.java)
            intentLeft.putExtra("Name",babyName.text.toString())
            startActivity(intentLeft)
        }

        btn_Right.setOnClickListener{
            val intentRight : Intent = Intent(this@sleepScreen, sleepRightScreen_Timer:: class.java)
            intentRight.putExtra("Name",babyName.text.toString())
            startActivity(intentRight)
        }
        // your code to perform when the user clicks on the button
        //Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
        //}
    }
}
