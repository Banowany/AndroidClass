package com.example.zadanie09

import com.example.zadanie09.models.CardPaymentRequest
import com.example.zadanie09.models.CardPaymentResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface API
{
    @POST("/cardPayment")
    fun performCardPayment(@Body cardPaymentRequest: CardPaymentRequest): Call<CardPaymentResponse>
}