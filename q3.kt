open class Vehicle {
    open fun startEngine() {
        println("Vehicle engine started")
    }
}

class Motorcycle : Vehicle() {
    override fun startEngine() {
        println("Vrooooom")
    }
}

fun main() {
    val bike = Motorcycle()
    bike.startEngine()
}
