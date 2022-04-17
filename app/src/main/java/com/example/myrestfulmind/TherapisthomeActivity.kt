package com.example.myrestfulmind

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TherapisthomeActivity: AppCompatActivity() {
    private lateinit var imageSchedule: ImageView
    private lateinit var tvUpdateSchedule: TextView
    private lateinit var tvViewHistory: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_therapisthome)

        tvUpdateSchedule = findViewById(R.id.tvUpdateSchedule)
        tvUpdateSchedule.setOnClickListener(View.OnClickListener {
            val registerIntent = Intent(this@TherapisthomeActivity, TherapisthomeActivity::class.java)
            startActivity(registerIntent)
        }
        )
        tvViewHistory = findViewById(R.id.tvViewHistory)
        tvViewHistory.setOnClickListener(View.OnClickListener {
            val registerIntent = Intent(this@TherapisthomeActivity, TherapisthomeActivity::class.java)
            startActivity(registerIntent)
        }
        )

        val imageSignout: ImageView = findViewById(R.id.imageSignout)
        imageSignout.setOnClickListener(View.OnClickListener {
            val regIntent = Intent(this@TherapisthomeActivity, MainActivity::class.java)
            startActivity(regIntent)
        })

        val imageSchedule: ImageView = findViewById(R.id.imageSchedule)
        imageSchedule.setOnClickListener(View.OnClickListener {
            val registerIntent = Intent(this@TherapisthomeActivity, CalenderActivity::class.java)
            startActivity(registerIntent)
        })


    }
}