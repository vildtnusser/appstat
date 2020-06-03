package com.google.app1


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.room.Room

class startsScreen : AppCompatActivity() {
    //lateinit var btn_click_me : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.startscreen)

    }

        // get reference to button
        val btn_menu = findViewById(R.id.menu1) as Button
        val btn_log = findViewById(R.id.log1) as Button
        val btn_stat = findViewById(R.id.stat1) as Button

        val intentName = intent
        val name : String? = intentName.getStringExtra("Name")
        val babyName = findViewById<TextView>(R.id.start_name1)
        babyName.text = name


        // set on-click listener
        btn_menu.setOnClickListener{
            val intentMenu : Intent = Intent(this@startsScreen, MainActivity:: class.java)
            intentMenu.putExtra("Name", babyName.text.toString())
            startActivity(intentMenu)
        }

        btn_log.setOnClickListener{
            val intentLog : Intent = Intent(this@startsScreen, logScreen:: class.java)
            intentLog.putExtra("Name", babyName.text.toString())
            startActivity(intentLog)
        }

        btn_stat.setOnClickListener{
            val intentStat : Intent = Intent(this@startsScreen, statStart:: class.java)
            intentStat.putExtra("Name", babyName.text.toString())
            startActivity(intentStat)
        }



        // your code to perform when the user clicks on the button
        //Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
        //}


    }
}
