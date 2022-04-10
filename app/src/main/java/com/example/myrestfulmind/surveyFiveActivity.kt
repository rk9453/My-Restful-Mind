package com.example.myrestfulmind

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class surveyFiveActivity: AppCompatActivity() {
    private lateinit var btnSurveyNext5: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_survey_one)

        btnSurveyNext5 = findViewById(R.id.btnSurveyNext5)
        btnSurveyNext5.setOnClickListener(View.OnClickListener {
            val registerIntent = Intent(this@surveyFiveActivity, ClienthomeActivity::class.java)
            startActivity(registerIntent)
        })
    }

}