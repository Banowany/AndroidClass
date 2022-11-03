package com.example.dao

import com.example.models.Products
import kotlinx.coroutines.Dispatchers
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.transactions.experimental.newSuspendedTransaction
import org.jetbrains.exposed.sql.transactions.transaction

object DatabaseFactory
{
    fun init()
    {
        val database = Database.connect(
            "jdbc:sqlite:data.db",
            "org.sqlite.JDBC"
            )

        transaction(database) {
            SchemaUtils.create(Products)
        }
    }

    suspend fun <T> dbQuery(block: suspend () -> T): T =
        newSuspendedTransaction(Dispatchers.IO) { block() }
}