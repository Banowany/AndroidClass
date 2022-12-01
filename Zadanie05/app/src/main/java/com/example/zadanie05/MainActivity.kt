package com.example.zadanie05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var productList = mutableListOf<Product>(
            Product("Produkt 1", "Opis produktu 1"),
            Product("Produkt 2", "Opis produktu 2"),
            Product("Produkt 3", "Opis produktu 3")
        )

        val adapter = ProductForRVAdapter(productList)
        val productListRV : RecyclerView = findViewById(R.id.productListRV)
        productListRV.adapter = adapter
        productListRV.layoutManager = LinearLayoutManager(this)
    }
}