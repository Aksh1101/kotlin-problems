import java.util.Scanner

fun main(args: Array<String>) {
    // TODO: Use the nextInt() method of the Scanner class to read an integer from the standard input.
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    // Then, add five to the read number and multiply the result by two.
    val sum = n + 5
    val mul = sum * 2
    // Finally, print the result of the multiplication to the standard output.
    println(mul)
}