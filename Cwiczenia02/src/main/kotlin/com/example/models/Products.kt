package com.example.models

import org.jetbrains.exposed.sql.*

data class Product(val id: Int, val name: String, val originCountry: String, val price: Double)

object Products : Table()
{
    val id = integer("id").autoIncrement()
    val name = varchar("name", 50)
    val originCountry = varchar("origin country", 50)
    val price = double("price")

    override val primaryKey = PrimaryKey(id)
}