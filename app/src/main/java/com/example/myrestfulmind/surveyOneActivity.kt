package com.example.myrestfulmind

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class surveyOneActivity: AppCompatActivity() {
    private lateinit var btnSurveyNext1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_survey_one)

        btnSurveyNext1 = findViewById(R.id.btnSurveyNext1)
        btnSurveyNext1.setOnClickListener(View.OnClickListener {
            val registerIntent = Intent(this@surveyOneActivity, surveyTwoActivity::class.java)
            startActivity(registerIntent)
        })
    }

}