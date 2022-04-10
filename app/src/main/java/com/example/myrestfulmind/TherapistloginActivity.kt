package com.example.myrestfulmind

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import com.example.myrestfulmind.database.AppDataBaseTh
import com.example.myrestfulmind.tasks.FetchTherapist
//import com.example.myrestfulmind.tasks.FetchUserTask

class TherapistloginActivity: AppCompatActivity() {
    private lateinit var tvRegister: TextView
    private lateinit var imageBack: ImageView
    private lateinit var etEmail: EditText
    private lateinit var etPassword: EditText
    private lateinit var btnLogin: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_therapistlogin)
        tvRegister = findViewById(R.id.tvRegister)
        tvRegister.setOnClickListener(View.OnClickListener {
            val registerIntent = Intent(this@TherapistloginActivity, TherapistsignupActivity::class.java)
            startActivity(registerIntent)
        })
        imageBack = findViewById(R.id.imageBack)
        imageBack.setOnClickListener(View.OnClickListener {
            val registerIntent = Intent(this@TherapistloginActivity, MainActivity::class.java)
            startActivity(registerIntent)
        }
        )

        val db = Room.databaseBuilder(
            this,
            AppDataBaseTh::class.java, "mrm-therapist-db"
        ).build()

        etEmail = findViewById(R.id.etEmail)
        etPassword = findViewById(R.id.etPassword)

        btnLogin = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener(View.OnClickListener {

            val email = etEmail.text.toString()
            val password = etPassword.text.toString()

            FetchTherapist(this@TherapistloginActivity, db, email, password, { user ->
                if (user == null) {
                    Toast.makeText(this@TherapistloginActivity, "User Not Found", Toast.LENGTH_SHORT)
                        .show()
                } else {
                    Toast.makeText(this@TherapistloginActivity, "User Found", Toast.LENGTH_SHORT)
                        .show()

                    val registerIntent =
                        Intent(this@TherapistloginActivity, TherapisthomeActivity::class.java)
                    startActivity(registerIntent)

                }
                }).execute()
        })
    }
}