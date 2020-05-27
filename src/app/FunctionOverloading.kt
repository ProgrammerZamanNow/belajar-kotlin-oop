package app

import data.Person

fun main() {
    val eko = Person()
    eko.firstName = "Eko"

    eko.sayHello("Budi")
    eko.sayHello("Joko", "Nugroho")
}