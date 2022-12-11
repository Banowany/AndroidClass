package com.example.zadanie06.data

import io.realm.kotlin.types.RealmObject
import io.realm.kotlin.types.annotations.PrimaryKey

class Category: RealmObject
{
    @PrimaryKey
    var categoryId: Int = 0
    var categoryName: String = ""
}