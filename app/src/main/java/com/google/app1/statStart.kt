package com.google.app1


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast
import android.util.Log
import android.view.View
import android.widget.TextView

class statStart : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.statstart)

        val intentName = intent
        val name = intentName.getStringExtra("Name")
        val babyName = findViewById<TextView>(R.id.stat_name1)
        babyName.text = name

        // get reference to button
        val btn_maal = findViewById(R.id.stat_maal1) as Button
        val btn_sleep = findViewById(R.id.stat_sleep1) as Button
        val btn_mad = findViewById(R.id.stat_mad1) as Button
        val btn_ble = findViewById(R.id.stat_ble) as Button
        val btn_pumpe = findViewById(R.id.stat_pumpe1) as Button
        val btn_all = findViewById(R.id.stat_all1) as Button



        // set on-click listener
        btn_maal.setOnClickListener{
            val intentMaal : Intent = Intent(this@statStart, statMaalScreen1:: class.java)
            intentMaal.putExtra("Name",babyName.text.toString())
            startActivity(intentMaal)
        }

        btn_sleep.setOnClickListener{
            val intentSleep : Intent = Intent(this@statStart, statSleepScreen1:: class.java)
            intentSleep.putExtra("Name",babyName.text.toString())
            startActivity(intentSleep)
        }

        btn_mad.setOnClickListener{
            val intentMad : Intent = Intent(this@statStart, statMadScreen1:: class.java)
            intentMad.putExtra("Name",babyName.text.toString())
            startActivity(intentMad)
        }

        btn_ble.setOnClickListener{
            val intentBle : Intent = Intent(this@statStart, statBleScreen:: class.java)
            intentBle.putExtra("Name",babyName.text.toString())
            startActivity(intentBle)
        }

        btn_pumpe.setOnClickListener{
            val intentPumpe : Intent = Intent(this@statStart, statPumpeScreen:: class.java)
            intentPumpe.putExtra("Name",babyName.text.toString())
            startActivity(intentPumpe)
        }

        btn_all.setOnClickListener{
            val intentAll : Intent = Intent(this@statStart, statAllScreen:: class.java)
            intentAll.putExtra("Name",babyName.text.toString())
            startActivity(intentAll)
        }


        // your code to perform when the user clicks on the button
        //Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
        //}
    }
}
