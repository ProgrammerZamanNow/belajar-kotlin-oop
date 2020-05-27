package app

import data.BigNote
import data.Note

fun main() {
    val note = Note("Belajar Kotlin")

    println(note.title)

    note.title = ""
    println(note.title)

    val bigNote = BigNote("Belajar kotlin")
    println(bigNote.title)
    println(bigNote.bigTitle)
}