package com.example.myrestfulmind

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class surveyThreeActivity: AppCompatActivity() {
    private lateinit var btnSurveyNext3: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_survey_one)

        btnSurveyNext3 = findViewById(R.id.btnSurveyNext3)
        btnSurveyNext3.setOnClickListener(View.OnClickListener {
            val registerIntent = Intent(this@surveyThreeActivity, surveyFourActivity::class.java)
            startActivity(registerIntent)
        })
    }

}