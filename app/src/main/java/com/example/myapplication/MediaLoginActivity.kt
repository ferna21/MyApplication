package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MediaLoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_media_login)

        val btnLogin = findViewById<Button>(R.id.btnLoginPrincipal)
        btnLogin.setOnClickListener {
            val ventanaLogin = Intent(applicationContext, LoginActivity::class.java)
            startActivity(ventanaLogin)
        }

    }


}