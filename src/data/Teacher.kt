package data

open class Teacher(val name:String) {
    private fun teach(){
        println("Teach!")
    }

    open protected fun test(){
        println("Test")
    }
}

class SuperTeacher(name:String) : Teacher(name){

    override public fun test(){
        super.test()
    }

}