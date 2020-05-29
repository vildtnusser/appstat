package com.google.app1


import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class pumpeScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pumpescreen)

        val intentName = intent
        val name = intentName.getStringExtra("Name")
        val babyName = findViewById<TextView>(R.id.pumpe_name1)
        babyName.text = name

        // get reference to button
        val btn_Left = findViewById(R.id.pumpe_left) as Button
        val btn_Right = findViewById(R.id.pumpe_right) as Button
        val btn_Both = findViewById(R.id.pumpe_both) as Button

        // set on-click listener
        btn_Left.setOnClickListener{
            val intentLeft : Intent = Intent(this@pumpeScreen, pumpeLeftScreen:: class.java)
            intentLeft.putExtra("Name",babyName.text.toString())
            startActivity(intentLeft)
        }

        btn_Right.setOnClickListener{
            val intentRight : Intent = Intent(this@pumpeScreen, pumpeRightScreen:: class.java)
            intentRight.putExtra("Name", babyName.text.toString())
            startActivity(intentRight)
        }

        btn_Both.setOnClickListener{
            val intentBoth: Intent = Intent(this@pumpeScreen, pumpeBothScreen:: class.java)
            intentBoth.putExtra("Name",babyName.text.toString())
            startActivity(intentBoth)
        }
    }
}
