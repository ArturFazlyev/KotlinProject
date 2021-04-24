package topics

fun main() {
    println(testSimple(5, 10))
    println(testString(5))
    println(testNameArgument(y = 5, x = 7, z = 6))
    println(testDefaultArguments())
    printEven(*intArrayOf(1,2,3,4,5,6))
}

fun testSimple(x: Int, y: Int) = x + y

fun testString(x: Int): String {
    return "String is $x"
}

fun testNameArgument(x: Int, y: Int, z: Int): List<Int> {
    return listOf(x, y, z)
}

fun testDefaultArguments(x: Int = 1, y: Int = 2) {
    println(x + y)
}

fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false) {
    (if (toUpperCase) name.toUpperCase() else name) + number
}

// vararg
fun printEven(vararg number: Int) {
    number.forEach { e -> if (e % 2 == 0) println(e) }

}