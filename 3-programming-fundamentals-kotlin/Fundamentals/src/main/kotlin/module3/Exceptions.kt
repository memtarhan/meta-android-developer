package module3

class MyError : Throwable("Some message")

fun someFunction() {
    throw MyError()
    println("Will not be printed")
}

// Important exceptions
fun findClusters(number: Int) {
    if (number < 1) throw IllegalArgumentException("The number of clusters cannot be smaller than 1, it is $number")
    // ...
}

var userName = ""

fun printUserName() {
    if (userName == "") throw IllegalStateException("User name must not be empty")
    // ...
}

fun main() {
    try {
        someFunction()
        println("Will not be printed")
    } catch (e: Throwable) {
        println("Caught $e") // Caught MyError: Some message
    }

    /*
    Finally block

    Inside try, you can also use a block called finally. It is used to specify a block of code
    that should always be invoked, even if an exception occurs.
     */

    try {
        someFunction()
        println("Will be printed") // Will be printed
    } finally {
        println("Finally block was called") // Finally block was called
    }
    println("Will be printed") // Will be printed
}