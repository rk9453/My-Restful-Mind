package com.example.myrestfulmind

import android.app.DatePickerDialog
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import com.example.myrestfulmind.database.DateDataBase
import com.example.myrestfulmind.database.Date

import com.example.myrestfulmind.tasks.InsertDate
import java.util.*

class therapistscheduleActivity: AppCompatActivity() {
    private lateinit var pickDateBtn: Button
    private lateinit var dateTv: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_therapist_schedule)
        //Calendar
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        val db = Room.databaseBuilder(
            this,
            DateDataBase::class.java, "date-db"
        ).build()

        //button click to show Date dialog
        val pickDateBtn: Button = findViewById(R.id.pickDateBtn)
        val dateTv: TextView = findViewById(R.id.pickDateBtn)
        pickDateBtn.setOnClickListener {
            val dpd = DatePickerDialog (this, DatePickerDialog.OnDateSetListener{ view, mYear, mMonth, mDay ->
                // set to textView
                dateTv.setText(""+ mDay +"/"+ mMonth +"/"+ mYear)
            }, year, month, day)
            // show dialog
            //hello
            dpd.show()
            val date = Date(day, month, year)
            //  db.userDAO().insert(user)
            InsertDate(this@therapistscheduleActivity, db, date).execute()
        }

    }
}

