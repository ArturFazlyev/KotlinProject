package topics

fun main(){
    var a: String? = "Hello"

    val l = a?.length ?: -1
    println(l)
}