package com.example.zadanie11

import android.annotation.SuppressLint
import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RemoteViews
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat

class MainActivity : AppCompatActivity()
{
    lateinit var button: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button1)

        button.setOnClickListener {
            val notificationBuilder = NotificationCompat.Builder(this)
                .setSmallIcon(androidx.core.R.drawable.notification_bg)
                .setContentTitle("Nowe produkty w sklepie")
                .setContentText("Odwiedz nasza apke i sprawdz")
                .setPriority(NotificationCompat.PRIORITY_HIGH)

            val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.notify(0, notificationBuilder.build())
        }
//        notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
//        var builder = NotificationCompat.Builder(this)
//            .setSmallIcon(R.drawable.ic )
//            .setContentTitle("UWAGA!!! POJAWIL SIE NOWY PRODUKT")
//            .setContentText("ZERKNIJ DO NASZEJ APKI I JE ZOBACZ")
//            .setAutoCancel(true)
//
//        notificationManager.notify(0, builder.build())
    }
}