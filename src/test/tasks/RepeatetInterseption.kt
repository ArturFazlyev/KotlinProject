package tasks

fun main() {

    println(getRepeatedInterseption(intArrayOf(1, 2, 3, 2, 0), intArrayOf(5, 1, 2, 7, 3, 2)))


}

fun getRepeatedInterseption(a1: IntArray, a2: IntArray): List<Int> {
    val s1 = a1.toHashSet()
    val s2 = a2.toHashSet()

    val result = mutableListOf<Int>()

    for (el in s1) {
        if (s2.contains(el)) {
            val numOfRepeats = minOf(a1.count { it == el }, a2.count() { it == el })
            repeat(numOfRepeats) {
                result.add(el)
            }
        }
    }

    return result
}