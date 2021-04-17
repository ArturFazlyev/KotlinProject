package topics

fun main() {
    println(testSimple(5, 10))
    println(testString(5))
    println(testNameArgument(y = 5, x = 7, z = 6))
}

fun testSimple(x: Int, y: Int) = x + y

fun testString(x: Int): String {
    return "String is $x"
}

fun testNameArgument(x: Int, y: Int, z: Int): List<Int> {
    return listOf(x, y, z)
}