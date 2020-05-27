package app

import data.User

fun main() {

    val user1 = User("eko", "rahasia")
    val user2 = User("joko", "rahasia123")

    user1.username = "budi"
    user1.password = "sangatrahasia"

    println(user1.username)
    println(user1.password)

    println(user2.username)
    println(user2.password)

}