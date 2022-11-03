package com.example.dao

import com.example.dao.DatabaseFactory.dbQuery
import com.example.models.Product
import com.example.models.Products
import kotlinx.coroutines.runBlocking
import org.jetbrains.exposed.sql.*

class DAOFacadeImpl : DAOFacade {
    private fun resultRowToProduct(row: ResultRow) = Product(
        id = row[Products.id],
        name = row[Products.name],
        originCountry = row[Products.originCountry],
        price = row[Products.price]
    )

    override suspend fun allProducts(): List<Product> = dbQuery{
        Products.selectAll().map(::resultRowToProduct)
    }

    override suspend fun product(id: Int): Product? = dbQuery {
        Products
            .select { Products.id eq id }
            .map(::resultRowToProduct)
            .singleOrNull()
    }

    override suspend fun addNewProduct(name: String, originCountry: String, price: Double): Product? = dbQuery {
        val insertStatement = Products.insert {
            it[Products.name] = name
            it[Products.originCountry] = originCountry
            it[Products.price] = price
        }
        insertStatement.resultedValues?.singleOrNull()?.let(::resultRowToProduct)
    }
}

val dao: DAOFacade = DAOFacadeImpl().apply {
    runBlocking {
        if(allProducts().isEmpty()) {
            addNewProduct("jabłko", "Polska", 1.50)
            addNewProduct("pomarańcza", "Chiny", 2.00)
            addNewProduct("Wiśnia", "Polska", 2.50)
            addNewProduct("Mango", "Indie", 3.00)
        }
    }
}