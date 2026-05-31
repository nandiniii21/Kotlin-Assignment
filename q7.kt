fun main() {
    val user1 = User(1, "Alice", true)

    // Copy with isActive = false
    val user2 = user1.copy(isActive = false)

    println(user1)
    println(user2)
}
