package com.google.app1


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.widget.Button
import android.widget.Chronometer
import android.widget.TextView

class pumpeBothScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pumpebothscreen)

        val c_meter = findViewById<Chronometer>(R.id.pumpeBoth_tid1)
        c_meter.setBase(SystemClock.elapsedRealtime())

        c_meter.start()

        val intentName = intent
        val name = intentName.getStringExtra("Name")
        val babyName = findViewById<TextView>(R.id.pumpeBoth_name1)
        babyName.text = name

        val btn_stop = findViewById<Button>(R.id.pumpeBoth_stop1)


        btn_stop.setOnClickListener{
            c_meter.stop()
            val intent2Pumpe : Intent = Intent(this@pumpeBothScreen, pumpeScreen:: class.java)
            intent2Pumpe.putExtra("Name",babyName.text.toString())
            startActivity(intent2Pumpe)
        }
    }
}