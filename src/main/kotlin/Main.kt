class Person {
    var name: String = ""
    var age: Int = 0
}

fun main(args: Array<String>) {

    /*Scope function: 'also' - It performs additional operation
    Property 1: Refer to context object by using 'it'
    Property 2: The return value is the 'context object'
    */
    val numberMutableList : MutableList<Int> = mutableListOf(1,2,3,4,5,6,7,8,9)

    val duplicateNumList = numberMutableList.also {
        println("List of elements are: $it")
        it.add(10)
        println("List of elements after adding an element: $it")
        it.remove(10)
        println("List of elements after removing an element: $it")
    }
    println("Original numbers: $numberMutableList")
    println("Duplicate numbers: $duplicateNumList")
}