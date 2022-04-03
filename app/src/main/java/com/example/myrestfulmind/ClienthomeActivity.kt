package com.example.myrestfulmind

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ClienthomeActivity: AppCompatActivity() {
    private lateinit var btnSurvey: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clienthome)

        val imageSignout: ImageView = findViewById(R.id.imageSignout)
        imageSignout.setOnClickListener(View.OnClickListener {
            val regIntent = Intent(this@ClienthomeActivity, MainActivity::class.java)
            startActivity(regIntent)
        })
        btnSurvey = findViewById(R.id.btnSurvey)
        btnSurvey.setOnClickListener(View.OnClickListener {
            val registerIntent = Intent(this@ClienthomeActivity, surveyOneActivity::class.java)
            startActivity(registerIntent)
        })
    }
}