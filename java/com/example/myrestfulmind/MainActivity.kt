package com.example.myrestfulmind

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var btnClient: Button
    private lateinit var btnTherapist: Button
    private lateinit var imageFacebook: ImageView
    private lateinit var imageInstagram: ImageView
    private lateinit var imageAbout: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnClient = findViewById(R.id.btnClient)
        btnTherapist = findViewById(R.id.btnTherapist)
        val textPrivacy: TextView = findViewById(R.id.txtLink)
        textPrivacy.movementMethod = LinkMovementMethod.getInstance()
        textPrivacy.setLinkTextColor(Color.BLUE)

        btnClient.setOnClickListener(View.OnClickListener {
            val registerIntent = Intent(this@MainActivity, ClientloginActivity::class.java)
            startActivity(registerIntent)
        })
        btnTherapist.setOnClickListener(View.OnClickListener {
            val regIntent = Intent(this@MainActivity, TherapistloginActivity::class.java)
            startActivity(regIntent)
        })
        val imageFacebook: ImageView = findViewById(R.id.imageFacebook)
        imageFacebook.setOnClickListener(View.OnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/myrestfulmind.org/"))
            startActivity(openURL)
        })
        val imageInstagram: ImageView = findViewById(R.id.imageInstagram)
        imageInstagram.setOnClickListener(View.OnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/myrestfulmind.inc/"))
            startActivity(openURL)
        })
//        val imageAbout: ImageView = findViewById(R.id.imageAbout)
//        imageAbout.setOnClickListener(View.OnClickListener {
//            val abt = Intent(Intent(this@MainActivity, ActivityAbout::class.java))
//            startActivity(abt)
//        })


    }
}