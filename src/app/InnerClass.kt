package app

import data.Boss

fun main() {
    val boss1 = Boss("Eko")
    val employee1 = boss1.Employee("Budi")
    val employee2 = boss1.Employee("Joko")

    val boss2 = Boss("Rudi")
    val employee3 = boss2.Employee("Budi")
    val employee4 = boss2.Employee("Joko")

    employee1.hi()
    employee2.hi()
    employee3.hi()
    employee4.hi()
}