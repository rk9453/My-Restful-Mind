package com.example.myrestfulmind

import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class CalenderActivity: AppCompatActivity() {

    private lateinit var pickDateBtn: Button
    private lateinit var dateTv: TextView
    override fun onCreate (savedInstanceState: Bundle?) {
        super.onCreate (savedInstanceState)
        setContentView(R.layout.activity_calender)

        //Calendar
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        //button click to show Date dialog
        val pickDateBtn: Button = findViewById(R.id.pickDateBtn)
        val dateTv: TextView = findViewById(R.id.pickDateBtn)
        pickDateBtn.setOnClickListener {
            val dpd = DatePickerDialog (this, DatePickerDialog.OnDateSetListener{view, mYear, mMonth, mDay ->
                // set to textView
                dateTv.setText(""+ mDay +"/"+ mMonth +"/"+ mYear)
            }, year, month, day)
            // show dialog
            //hello
            dpd.show()
        }

    }



}