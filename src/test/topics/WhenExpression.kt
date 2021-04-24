package topics

fun main(){
testWhen("sfsdf")
}

fun testWhen(input: Any){
    when (input){
        1 -> println("1")
        10..20 -> println("от 10 до 20")
        is String -> println("Это строка ${input.length}")
        else -> println("Что то еще")

    }

}