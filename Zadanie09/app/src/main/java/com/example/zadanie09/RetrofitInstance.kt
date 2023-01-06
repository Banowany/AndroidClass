package com.example.zadanie09

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance
{
    val api: API by lazy {
        Retrofit.Builder()
            .baseUrl("http://0.0.0.0:8080")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(API::class.java)
    }
}