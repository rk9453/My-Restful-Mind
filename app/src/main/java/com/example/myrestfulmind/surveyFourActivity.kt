package com.example.myrestfulmind

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class surveyFourActivity: AppCompatActivity() {
    private lateinit var btnSurveyNext4: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_survey_one)

        btnSurveyNext4 = findViewById(R.id.btnSurveyNext4)
        btnSurveyNext4.setOnClickListener(View.OnClickListener {
            val registerIntent = Intent(this@surveyFourActivity, surveyFiveActivity::class.java)
            startActivity(registerIntent)
        })
    }

}