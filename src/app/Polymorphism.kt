package app

import data.Employee
import data.Manager
import data.VicePresident

fun main() {
    var employee: Employee = Employee("Eko")
    employee.sayHello("Budi")

    employee = Manager("Eko")
    employee.sayHello("Budi")

    employee = VicePresident("Eko")
    employee.sayHello("Budi")
}