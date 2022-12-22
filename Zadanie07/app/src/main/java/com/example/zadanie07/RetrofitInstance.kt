package com.example.zadanie07

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance
{
    val api: Api by lazy {
        Retrofit.Builder()
            .baseUrl("http://0.0.0.0:8080")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(Api::class.java)
    }
}