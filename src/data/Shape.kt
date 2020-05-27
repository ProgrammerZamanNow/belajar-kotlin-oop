package data

open class Shape {
    open val corner: Int = -1
    open fun printName(){
        println("This is Shape")
    }
}

class Rectangle : Shape() {
    override val corner: Int = 4
    val parentCorner:Int = super.corner
    override fun printName() {
        println("This is Rectangle")
        super.printName()
    }
}

open class Triangle : Shape() {
    override val corner: Int = 3
}