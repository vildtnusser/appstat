package com.google.app1


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

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