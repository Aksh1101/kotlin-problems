fun main() {
    val x: Boolean = readLine().toBoolean() // read other values in the same way
    val y: Boolean = readLine().toBoolean()
    val z: Boolean = readLine().toBoolean()
    // write your code here
    val result = !(x&&y)||(z)
    println(result)
}