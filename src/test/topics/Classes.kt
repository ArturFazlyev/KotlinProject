package topics

fun main() {
    val children = Person("Mike", "Ryan", 3)
    val p1 = Person("John", "Johnson", 40, children)
    println(p1.age)

    val rectangle1 = Rectangle(5.0, 2.0)
    println("Perimeter is ${rectangle1.perimer}")

    val rectangle2 = Rectangle(5.0, 2.0)
    println(rectangle1 == rectangle2) // true


}

// Primary constructor
class Person(val firstName: String, val lastName: String, var age: Int) {

    var children: MutableList<Person> = mutableListOf()

    init {
        println("Person is created $firstName")
    }

    constructor(firstName: String, lastName: String, age: Int, child: Person) :
            this(firstName, lastName, age) {
        children.add(child)
    }


}

data class Rectangle(var height: Double, var lenght: Double) {
    var perimer = (height + lenght) * 2
    var test = 1
        get() = field + 1 // this.поле
        set(value) {
            if (value < 0) println("Negative value")
            field = value
        }

    fun area() = height * lenght


}
