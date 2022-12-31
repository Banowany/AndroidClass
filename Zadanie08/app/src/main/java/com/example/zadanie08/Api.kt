package com.example.zadanie08

import com.example.zadanie08.models.LoginRequest
import com.example.zadanie08.models.LoginResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface Api
{
    @POST("/postLogin")
    fun postLogin(@Body loginRequest: LoginRequest): Call<LoginResponse>
}