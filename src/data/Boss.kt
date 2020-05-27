package data

class Boss(val name: String) {

    inner class Employee(val name: String){

        fun hi(){
            println("Hi, my name is $name, my boss name is ${this@Boss.name}")
        }

    }
}