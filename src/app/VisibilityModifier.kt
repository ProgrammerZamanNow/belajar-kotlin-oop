package app

import data.SuperTeacher
import data.Teacher

fun main() {
    val teacher = SuperTeacher("Eko")
    println(teacher.name)
    // teacher.teach() // error
    teacher.test()
}