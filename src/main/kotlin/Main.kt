class Person {
    var name: String = "Rugved"
    var age: Int = 32
}

fun main(args: Array<String>) {
    val person = Person()

    with(person) {
        println(this.name)
        println(this.age)
    }
}