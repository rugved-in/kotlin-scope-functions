class Person {
    var name: String = ""
    var age: Int = 0
}

fun main(args: Array<String>) {

    /*Scope function: 'apply'
    Property 1: Refer to context object by using 'this'
    Property 2: The return value is the 'context object'
    */
    val person = Person().apply() {
        this.name = "Rugved"
        this.age = 31
    }

    with(person) {
        println("Name: ${this.name}")
        println("Age: ${this.age}")
    }
}