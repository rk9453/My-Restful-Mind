package com.example.myrestfulmind

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TermsActivity: AppCompatActivity() {
    private lateinit var imageBack:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terms)
        imageBack = findViewById(R.id.imageBack)
        imageBack.setOnClickListener(View.OnClickListener {
            val registerIntent = Intent(this@TermsActivity, AboutUsActivity::class.java)
            startActivity(registerIntent)
        }
        )
    }
}