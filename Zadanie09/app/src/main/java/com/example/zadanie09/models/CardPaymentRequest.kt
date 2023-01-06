package com.example.zadanie09.models

data class CardPaymentRequest(
    val cardNumber: String,
    val expirationDate: String,
    val cvv: String
)
