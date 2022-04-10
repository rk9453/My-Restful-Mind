package com.example.myrestfulmind

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class surveyTwoActivity: AppCompatActivity() {
    private lateinit var btnSurveyNext: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_survey_two)

        btnSurveyNext = findViewById(R.id.btnSurveyNext)
        btnSurveyNext.setOnClickListener(View.OnClickListener {
            val registerIntent = Intent(this@surveyTwoActivity, surveyThreeActivity::class.java)
            startActivity(registerIntent)
        })
    }

}