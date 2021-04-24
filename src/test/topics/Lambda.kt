package topics

fun main() {
    val a = listOf(1, 2, 3, 4, 5, -6)

    a.forEach { e -> println(e) }
    a.map { e -> e * 2 }
    a.filter { e -> e % 2 == 0 }
    a.reduce { sum, e -> sum + e } // sum

    a.sortedByDescending { it }
    a.any { it > 5 } // true
    a.all { it < 10 } // true
    a.sum()
    val (positive, negative) = a.partition { it > 0 }
    println(positive)
    println(negative)

    val result = listOf("a", "bb", "ccc").groupBy { it.length }
    println(result)
}