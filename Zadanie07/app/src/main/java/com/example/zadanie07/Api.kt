package com.example.zadanie07

import com.example.zadanie07.models.Category
import com.example.zadanie07.models.Product
import retrofit2.http.GET
import retrofit2.Response

interface Api
{
    @GET("/categories")
    fun getCategories(): Response<List<Category>>


    @GET("/products")
    fun getProducts(): Response<List<Product>>
}