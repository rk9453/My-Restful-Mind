package com.example.myrestfulmind

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class surveyTwoActivity: AppCompatActivity() {
    private lateinit var btnSurveyNext2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_survey_two)

        btnSurveyNext2 = findViewById(R.id.btnSurveyNext2)
        btnSurveyNext2.setOnClickListener(View.OnClickListener {
            val registerIntent = Intent(this@surveyTwoActivity, surveyThreeActivity::class.java)
            startActivity(registerIntent)
        })
    }

}