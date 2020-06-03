package com.google.app1

import android.app.DatePickerDialog;
import android.content.Intent
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button
import android.widget.DatePicker;
import android.widget.EditText
import android.widget.TextView;
import kotlinx.android.synthetic.main.velkommen.*
import android.content.DialogInterface;
//import android.content.SharpedPreferences;
import androidx.appcompat.app.AlertDialog;
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room

import java.util.Calendar;
import javax.xml.datatype.DatatypeConstants.MONTHS


//Test comment for git
class velkommen : AppCompatActivity() {
    var mDisplayDate: TextView? = null
    var mDateSetListener: DatePickerDialog.OnDateSetListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.velkommen)


        //Making a calender to pick the date
        val mDisplayDate = findViewById<TextView>(R.id.birthDate)
        mDisplayDate!!.setOnClickListener {
            val cal = Calendar.getInstance()
            val year = cal[Calendar.YEAR]
            val month = cal[Calendar.MONTH]
            val day = cal[Calendar.DAY_OF_MONTH]
            val dialog = DatePickerDialog(
                this@velkommen,
                mDateSetListener,
                year, month, day
            )
            dialog.show()
        }
        mDateSetListener =
                //DatePickerDialog.OnDateSetListener { datePicker, year, month, day -> (original)
            DatePickerDialog.OnDateSetListener { _, year, month, day ->
                var month = month
                month = month + 1
                Log.d(
                    "velkommen",
                    "onDateSet: dd/mm/yyy: $day/$month/$year"
                )
                val date = "$day/$month/$year"
                //mDisplayDate!!.text = date (original)
                mDisplayDate!!.text = date
            }


        //Moving on to the start screen and keeping the user defined name

        val btn_GO = findViewById(R.id.videre2start) as Button
        val Navn = findViewById<EditText>(R.id.babyName)

        btn_GO.setOnClickListener {
            val navn = Navn.text.toString()

            val intent2Start: Intent = Intent(this@velkommen, startsScreen::class.java)
            intent2Start.putExtra("Name", navn)
            startActivity(intent2Start)
        }

       /* //skulle gemme værdierne
        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "first_name"
        ).build()*/
    }
}


   // companion object {
    //private const val TAG = "velkommen"

/* //(*) SKULLE BRUGES TIL KUN AT ÅBNE FØRSTE GANG
 val prefs = .getSharedPreferences("prefs", Context.MODE_PRIVATE);
        val boolean firstStart = prefs.getBoolean("firstStart", true);
        if (firstStart) {
            showStartDialog();
        }
    }
    showStartDialog() {
        val AlertDialog.Builder(this)
            .setTitle("One Time Dialog")
            .setMessage("This should only be shown once")
            .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            })
            .create().show();
        SharedPreferences prefs = getSharedPreferences("prefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean("firstStart", false);
        editor.apply();*
    }*/

