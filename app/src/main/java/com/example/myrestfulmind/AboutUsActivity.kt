package com.example.myrestfulmind

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AboutUsActivity: AppCompatActivity() {
    private lateinit var imageBack:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aboutus)

        val faqs: ImageView = findViewById(R.id.faqs)
        faqs.setOnClickListener(View.OnClickListener {
            val abt = Intent(Intent(this@AboutUsActivity, FaqsActivity::class.java))
            startActivity(abt)
        })
        val terms: ImageView = findViewById(R.id.terms)
        terms.setOnClickListener(View.OnClickListener {
            val abt = Intent(Intent(this@AboutUsActivity, TermsActivity::class.java))
            startActivity(abt)
        })
        imageBack = findViewById(R.id.imageBack)
        imageBack.setOnClickListener(View.OnClickListener {
            val registerIntent = Intent(this@AboutUsActivity, MainActivity::class.java)
            startActivity(registerIntent)
        }
        )

    }
}