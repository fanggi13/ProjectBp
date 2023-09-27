package com.example.projectbp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        //instance
        val btnLogin:Button = findViewById(R.id.buttonLogin)
        val txtUsername:EditText = findViewById(R.id.editTextUsername)
        val txtPassword:EditText = findViewById(R.id.editTextPassword)
        val logModel = LoginModel ()
        //event btn login di-klik
        btnLogin.setOnClickListener {
            logModel.username = txtUsername.text.toString()
            logModel.password = txtPassword.text.toString()
            //validasi login
            if (logModel.logincek() == true) {
             {
                //call home activity
                val intentHome = Intent(this, HomeActivity::class.java)
                startActivity(intentHome)
            } else {
                Toast.makeText(this, "Userame/Password salah", Toast.LENGTH_SHORT).show()
            }

        }
    }
}