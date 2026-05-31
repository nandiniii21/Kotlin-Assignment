class BankAccount {
    private var balance: Double = 0.0
    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Deposited: $amount")
        } else {
            println("Invalid amount")
        }
    }
    fun getBalance(): Double {
        return balance
    }
}
fun main() {
    val acc = BankAccount()
    acc.deposit(1000.0)
    println("Balance: ${acc.getBalance()}")
}
