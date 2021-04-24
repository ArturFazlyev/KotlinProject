package tasks

fun main() {
    val a = "AAAAAABBBBBBBBBBBBBCCDDDDDDDDDDDDDDAAAAAAAAAABBBBBBBBBBBB"

    println(countLetters(a))

}

fun countLetters(string: String): String {
    var currentLetter = string[0]
    var count = 1
    var result = ""

    for (letter in string.substring(1)) {
        if (currentLetter == letter) {
            count++
        } else {
            if (count == 1)
                result += currentLetter
            else
                result += "$currentLetter$count"

            count = 1
            currentLetter = letter
        }
    }

    if (count == 1) {
        result += currentLetter
    } else
        result += "$currentLetter$count"

    return result
}