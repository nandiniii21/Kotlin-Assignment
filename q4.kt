open class Employee(val baseSalary: Int)

class Manager : Employee(80000)

fun main() {
    val m = Manager()
    println("Salary: ${m.baseSalary}")
}
