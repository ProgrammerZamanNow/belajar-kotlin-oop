package app

import data.Student
import data.sayHello
import data.upperName

fun main() {
    val student: Student? = Student("Eko", 15)
    student.sayHello("Budi")
    println(student?.upperName)
}