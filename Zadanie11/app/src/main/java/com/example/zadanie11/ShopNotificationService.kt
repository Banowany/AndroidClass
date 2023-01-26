package com.example.zadanie11

import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import androidx.core.app.NotificationCompat

class ShopNotificationService(
    private val context: Context
) {
    private val notificationManager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

    fun showNotification() {
        val notification = NotificationCompat.Builder(context, PRODUCT_CHANNEL_ID)
            .setSmallIcon(R.drawable.baseline_add_shopping_cart_24)
            .setContentTitle("NOWY PRODUKT")
            .setContentText("WEJDZ NA NASZA APLIKACJE I SPRAWDZ")
            .build()

        notificationManager.notify(1, notification)
    }

    companion object{
        const val PRODUCT_CHANNEL_ID = "product_channel"
    }
}
