package com.example.zadanie08

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity()
{
    lateinit var bLogin: Button
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bLogin = findViewById(R.id.bLogin)
        bLogin.setOnClickListener{
            val etLogin = findViewById<EditText>(R.id.etName)
            val etPassword = findViewById<EditText>(R.id.etPassword)
            val exampleLogin = "admin"
            val examplePassword = "admin"
            if (etLogin.text.toString()==exampleLogin && etPassword.text.toString()==examplePassword)
            {
                Toast.makeText(this, "Udało się", Toast.LENGTH_LONG).show()
            }
            else
            {
                Toast.makeText(this, "Nie Udało się", Toast.LENGTH_LONG).show()
            }
        }
    }
}