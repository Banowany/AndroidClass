package com.example.zadanie09

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intentToPaymentFormActivity = Intent(this, PaymentFormActivity::class.java)
        this.startActivity(intentToPaymentFormActivity)
    }
}