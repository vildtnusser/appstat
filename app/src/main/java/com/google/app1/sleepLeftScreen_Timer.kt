package com.google.app1


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.widget.Button
import android.widget.Chronometer
import android.widget.TextView

class sleepLeftScreen_Timer: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sleepleftscreen)

        val c_meter = findViewById<Chronometer>(R.id.sleepLeft_tid1)
        c_meter.setBase(SystemClock.elapsedRealtime())

        c_meter.start()

        val intentName = intent
        val name = intentName.getStringExtra("Name")
        val babyName = findViewById<TextView>(R.id.sleepLeft_name1)
        babyName.text = name

        val btn_stop = findViewById<Button>(R.id.sleepLeft_stop1)
        btn_stop.setOnClickListener{
            c_meter.stop()
            val intent2Sleep : Intent = Intent(this@sleepLeftScreen_Timer, sleepScreen:: class.java)
            intent2Sleep.putExtra("Name",babyName.text.toString())
            startActivity(intent2Sleep)
        }
    }
}