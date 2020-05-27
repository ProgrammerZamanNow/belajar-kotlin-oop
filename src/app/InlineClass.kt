package app

import data.Token

fun main() {
    val token = Token("ini token")
    println(token.value)
    println(token.toUpper())
}