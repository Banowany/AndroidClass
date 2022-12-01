package com.example.zadanie05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ProductSite : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_site)

        val product = intent.getSerializableExtra("product") as Product

        val productSiteName : TextView = findViewById(R.id.productSiteName)
        val productSiteDescription : TextView = findViewById(R.id.productSiteDesription)

        productSiteName.text = product.name
        productSiteDescription.text = product.description
    }
}