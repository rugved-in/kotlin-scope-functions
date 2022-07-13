class Person {
    var name: String = ""
    var age: Int = 0
}

fun main(args: Array<String>) {

    /*Scope function: 'run' - combination of with and let
    Property 1: Refer to context object by using 'this'
    Property 2: The return value is the 'lambda result'
    */
    val person = Person().apply {
        name = "Rugved"
        age = 31
    }

    val ageAfterFiveYears = person?.run {
        println(this.name)
        println(this.age)
        this.age + 5
    }
    println("Age after five years is $ageAfterFiveYears")
}