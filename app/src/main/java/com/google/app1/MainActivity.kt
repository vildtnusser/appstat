package com.google.app1




import android.content.Intent
//import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // get reference to button
        val btn_maal = findViewById(R.id.menu_maal1) as Button
        val btn_sleep = findViewById(R.id.menu_sleep1) as Button
        val btn_mad = findViewById(R.id.menu_mad1) as Button
        val btn_ble = findViewById(R.id.menu_ble) as Button
        val btn_pumpe = findViewById(R.id.menu_pumpe1) as Button
        val btn_diverse = findViewById(R.id.menu_diverse1) as Button

        val intentName = intent
        val name = intentName.getStringExtra("Name")
        val babyName = findViewById<TextView>(R.id.menu_name1)
        babyName.text = name

        // set on-click listener
        btn_maal.setOnClickListener{
            val intentMaal : Intent = Intent(this@MainActivity, maalScreen:: class.java)
            intentMaal.putExtra("Name", babyName.text.toString())
            startActivity(intentMaal)
        }

        btn_sleep.setOnClickListener{
            val intentSleep : Intent = Intent(this@MainActivity, sleepScreen:: class.java)
            intentSleep.putExtra("Name", babyName.text.toString())
            startActivity(intentSleep)
        }

        btn_mad.setOnClickListener{
            val intentMad : Intent = Intent(this@MainActivity, madScreen:: class.java)
            intentMad.putExtra("Name", babyName.text.toString())
            startActivity(intentMad)
        }

        btn_ble.setOnClickListener{
            val intentBle : Intent = Intent(this@MainActivity, bleScreen:: class.java)
            intentBle.putExtra("Name", babyName.text.toString())
            startActivity(intentBle)
        }

        btn_pumpe.setOnClickListener{
            val intentPumpe : Intent = Intent(this@MainActivity, pumpeScreen:: class.java)
            intentPumpe.putExtra("Name", babyName.text.toString())
            startActivity(intentPumpe)
        }

        btn_diverse.setOnClickListener{
            val intentDiverse : Intent = Intent(applicationContext, diverseScreen:: class.java)
            startActivity(intentDiverse)
        }



    }
}



