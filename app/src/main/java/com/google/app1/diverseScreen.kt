package com.google.app1


import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class diverseScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.diversescreen)

        val testButton = findViewById(R.id.diverse2velkommer) as Button
        testButton.setOnClickListener{
            val intentTest : Intent = Intent(applicationContext, velkommen:: class.java)
            startActivity(intentTest)
        }

    }
}