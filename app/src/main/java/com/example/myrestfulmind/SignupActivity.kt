package com.example.myrestfulmind

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import com.example.myrestfulmind.database.AppDataBase
import com.example.myrestfulmind.database.User
import com.example.myrestfulmind.tasks.RegisterUserTask

class SignupActivity: AppCompatActivity() {
    private lateinit var tvLogin: TextView
    private lateinit var etEmail: EditText
    private lateinit var etPassword: EditText
    private lateinit var etFirstName: EditText
    private lateinit var etLastName: EditText
    private lateinit var etPhoneNumber: EditText
    private lateinit var btnSignup: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        etFirstName = findViewById(R.id.etFirstName)
        etLastName = findViewById(R.id.etLastName)
        etEmail = findViewById(R.id.etEmail)
        etPhoneNumber = findViewById(R.id.etPhoneNumber)
        etPassword = findViewById(R.id.etPassword)
        btnSignup = findViewById(R.id.btnSignup)

        val db = Room.databaseBuilder(
            this,
            AppDataBase::class.java, "mrm-client-db"
        ).build()

        btnSignup.setOnClickListener(View.OnClickListener {
            val email = etEmail.text.toString()
            val password = etPassword.text.toString()
            val fname = etFirstName.text.toString()
            val lname = etLastName.text.toString()
            val phone = etPhoneNumber.text.toString()

            val user = User(email, password, phone, fname, lname)
          //  db.userDAO().insert(user)
            RegisterUserTask(this@SignupActivity, db, user).execute()

            val registerIntent = Intent(this@SignupActivity, ClientloginActivity::class.java)
            startActivity(registerIntent)
        })

        tvLogin = findViewById(R.id.tvLogin)
        tvLogin.setOnClickListener(View.OnClickListener {
            val registerIntent = Intent(this@SignupActivity, ClientloginActivity::class.java)
            startActivity(registerIntent)
        }
        )
    }
}