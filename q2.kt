class Thermostat {
    var temperature: Double = 20.0
        private set

    fun setTemp(value: Double) {
        if (value in 10.0..30.0) {
            temperature = value
        } else {
            println("Out of range")
        }
    }
}

fun main() {
    val t = Thermostat()
    t.setTemp(25.0)
    println(t.temperature)
}
