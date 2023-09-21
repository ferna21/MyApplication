package com.example.myapplication

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

        val btnLogin = findViewById<Button>(R.id.btnLogin)
        btnLogin.setOnClickListener {
            val email = findViewById<EditText>(R.id.txtEmail)
            val pass = findViewById<EditText>(R.id.txtPass)

            if (email.text.toString() == "admin" && pass.text.toString() == "admin"){
                Toast.makeText(applicationContext, "Accediendo a la app", Toast.LENGTH_SHORT).show()
                val ventanaMain = Intent(applicationContext, MainActivity::class.java)
                startActivity(ventanaMain)
            }
        }
    }
}