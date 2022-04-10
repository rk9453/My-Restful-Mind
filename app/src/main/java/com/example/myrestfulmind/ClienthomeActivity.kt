package com.example.myrestfulmind

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ClienthomeActivity: AppCompatActivity() {
    private lateinit var btnSurvey: Button
    private lateinit var imageSchedule: ImageView
    private lateinit var imageHistory: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clienthome)

        val imageSignout: ImageView = findViewById(R.id.imageSignout)
        imageSignout.setOnClickListener(View.OnClickListener {
            val regIntent = Intent(this@ClienthomeActivity, MainActivity::class.java)
            startActivity(regIntent)
        })
        imageSchedule = findViewById(R.id.imageSchedule)
        imageSchedule.setOnClickListener(View.OnClickListener {
            val registerIntent = Intent(this@ClienthomeActivity, ClienthomeActivity::class.java)
            startActivity(registerIntent)
        }
        )
        imageHistory = findViewById(R.id.imageHistory)
        imageHistory.setOnClickListener(View.OnClickListener {
            val registerIntent = Intent(this@ClienthomeActivity, ClienthomeActivity::class.java)
            startActivity(registerIntent)
        }
        )
        btnSurvey = findViewById(R.id.btnSurvey)
        btnSurvey.setOnClickListener(View.OnClickListener {
            val registerIntent = Intent(this@ClienthomeActivity, surveyOneActivity::class.java)
            startActivity(registerIntent)
        })
    }
}