package app

import data.Television

fun main() {
    val tv = Television()
    tv.brand = "Samsung"
    tv.initTelevision("Samsung")
    println(tv.brand)
}