package com.example.myfoodapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class WelcomeActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var registerbtn =findViewById<Button>(R.id.RegisterButton)
        registerbtn.setOnClickListener{

            val intent1 = Intent(this,RegistrationActivity::class.java)
            startActivity(intent1)


        }

        var signinbtn =findViewById<TextView>(R.id.signinButton)
        signinbtn.setOnClickListener {

            val intent2 = Intent(this,LoginActivity::class.java)
            startActivity(intent2)


        }


    }


    fun register(view: View) {}
}