package com.example.zadanie06.data

import io.realm.kotlin.types.RealmObject
import io.realm.kotlin.types.annotations.PrimaryKey

class Product: RealmObject
{
    @PrimaryKey
    var productId: Int = 0
    var productName: String = ""
    var productDescription: String =""
    var categoryId: Int = 0
}
