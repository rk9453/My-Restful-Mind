package com.example.myrestfulmind

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TherapisthomeActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_therapisthome)

        val imageSignout: ImageView = findViewById(R.id.imageSignout)
        imageSignout.setOnClickListener(View.OnClickListener {
            val regIntent = Intent(this@TherapisthomeActivity, MainActivity::class.java)
            startActivity(regIntent)
        })


    }
}