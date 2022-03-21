package com.example.myrestfulmind

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ClientloginActivity: AppCompatActivity() {
    private lateinit var tvRegister:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clientlogin)
        tvRegister = findViewById(R.id.tvRegister)
        tvRegister.setOnClickListener(View.OnClickListener {
            val registerIntent = Intent(this@ClientloginActivity, SignupActivity::class.java)
            startActivity(registerIntent)
        }
        )
    }
}