package app

import data.Company

fun main() {
    val company1 = Company("Eko")
    val company2 = Company("Eko")

    println(company1.hashCode())
    println(company2.hashCode())
    println(company1.hashCode() == company2.hashCode())
}