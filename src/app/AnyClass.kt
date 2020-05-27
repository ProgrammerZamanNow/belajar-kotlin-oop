package app

import data.SmartPhone

fun main() {
    val smartPhone = SmartPhone("Samsung S10", "Android")

    println(smartPhone.toString())
    println(smartPhone.hashCode())
}