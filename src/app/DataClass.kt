package app

import data.Product

fun main() {
    val product = Product("Indomie", 2500, "Food")
    val product2 = product.copy(name = "Supermie")

    println(product)
    println(product2)
}