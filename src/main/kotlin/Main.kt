class Person {
    var name: String = ""
    var age: Int = 0
}

fun main(args: Array<String>) {

    /*Scope function: 'let' - use let function to avoid NullPointerException
    Property 1: Refer to context object by using 'it'
    Property 2: The return value is the 'lambda result'
    */
    val name: String? = "rugved"

    name?.let {
        println("Reversed: ${it.reversed()}")
        println("Capitalized: ${it.capitalize()}")
        println("Length: ${it.length}")
    }
}