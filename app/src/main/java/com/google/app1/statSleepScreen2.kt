package com.google.app1


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class statSleepScreen2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.statsleepscreen2)

        val intentName = intent
        val name = intentName.getStringExtra("Name")
        val babyName = findViewById<TextView>(R.id.statSleep_name2)
        babyName.text = name
    }
}