package com.example.myrestfulmind

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btnClient: Button
    private lateinit var btnTherapist: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnClient = findViewById(R.id.btnClient)
        btnTherapist = findViewById(R.id.btnTherapist)

        btnClient.setOnClickListener(View.OnClickListener {
            val registerIntent = Intent(this@MainActivity, ClientloginActivity::class.java)
            startActivity(registerIntent)
        })
        btnTherapist.setOnClickListener(View.OnClickListener {
            val regIntent = Intent(this@MainActivity, TherapistloginActivity::class.java)
            startActivity(regIntent)
        })
    }
}