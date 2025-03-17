package com.klu.onlinegrocery

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup)
        var getStartedButton = findViewById<ImageView>(R.id.signUpButton)
        getStartedButton.setOnClickListener{
            var gsbIntent = Intent(this,home::class.java)
            startActivity(gsbIntent)
        }
    }
}