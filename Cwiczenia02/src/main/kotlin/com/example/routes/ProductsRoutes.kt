package com.example.routes

import com.example.dao.dao
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.products()
{
    get("/products")
    {
        val products = dao.allProducts()
        call.respond(products)
    }
    get("/product-{id?}")
    {
        val idString = call.parameters["id"] ?: return@get call.respondText { "INVALID ID" }
        val id = idString.toInt()
        val product = dao.product(id) ?: return@get call.respondText { "I do not have that product" }
        call.respond(product)
    }
}

fun Application.productsRoutes()
{
    routing{
        products()
    }
}