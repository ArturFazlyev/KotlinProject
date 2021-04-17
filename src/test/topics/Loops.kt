package topics

fun main(){
    val items = listOf("Apple", "Banana", "Orange")
    for (item in items)
        println(item)


    var index = 0
    while (index < items.size){
        println("Item is $index is ${items[index]}")
        index++
    }

    for (i in 1..10)
        print("$i ")
        println()

    // не выводить последнее значение в диапазоне
    for(i in 5 until 20)
        print("$i ")
        println()

    for (i in 10 downTo 1)
        print("$i ")
        println()

    for (i  in 1..100 step 10)
        print("$i ")
        println()
}