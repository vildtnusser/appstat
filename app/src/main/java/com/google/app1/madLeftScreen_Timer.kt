package com.google.app1


import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.widget.Button
import android.widget.Chronometer
import android.widget.TextView

class madLeftScreen_Timer : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.madleftscreen)

        val c_meter = findViewById<Chronometer>(R.id.madLeft_tid1)
        c_meter.setBase(SystemClock.elapsedRealtime())

        c_meter.start()

        val intentName = intent
        val name = intentName.getStringExtra("Name")
        val babyName = findViewById<TextView>(R.id.madLeft_name1)
        babyName.text = name

        val btn_stop = findViewById<Button>(R.id.madLeft_stop1)


        btn_stop.setOnClickListener{
            c_meter.stop()
            val intent2Mad : Intent = Intent(this@madLeftScreen_Timer, madScreen:: class.java)
            intent2Mad.putExtra("Name",babyName.text.toString())
            startActivity(intent2Mad)
        }
    }
}