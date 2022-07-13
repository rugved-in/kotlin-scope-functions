class Person {
    var name: String = "Rugved"
    var age: Int = 32
}

fun main(args: Array<String>) {

    /*Scope function: 'with'
    Property 1: Refer to context object by using 'this'
    Property 2: The return value is the 'lambda result'
    */
    val person = Person()

    val ageAfterFiveYears = with(person) {
        println(this.name)
        println(this.age)
        age + 5
    }
    println("Age after five years is $ageAfterFiveYears")
}