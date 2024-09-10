import kotlin.system.exitProcess

fun main() {
    // Read input age
    val age = readlnOrNull()?.toIntOrNull() ?: run {
        println("Invalid input")
        exitProcess(1)}

    val category = when{
        age < 18 -> "Child"
        age in 18..64 -> "Adult"
        age > 65 -> "Senior"
        else -> "Unknown"

    }
    println(category)
}