package com.example.myrestfulmind

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TherapistsignupActivity:AppCompatActivity(){
    private lateinit var tvLogin: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_therapistsignup)
        tvLogin = findViewById(R.id.tvLogin)
        tvLogin.setOnClickListener(View.OnClickListener {
            val registerIntent = Intent(this@TherapistsignupActivity, TherapistloginActivity::class.java)
            startActivity(registerIntent)
        }
        )
    }
}