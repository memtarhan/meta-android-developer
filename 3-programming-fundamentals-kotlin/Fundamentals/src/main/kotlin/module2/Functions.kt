package module2

fun printStars(num: Int) {
    for (i in 1..num) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
}

fun getTriangleArea(width: Double, height: Double): Double {
    return width * height / 2
}

// In Kotlin, there is a special syntax for single expression functions. Instead of braces with the body,
// you use the equality sign, which specifies what should be returned.
fun triangleArea(width: Double, height: Double): Double = width * height / 2

fun biggerOf(a: Int, b: Int): Int = if (a > b) a else b

// Recursion
fun factorial(number: Int): Int {
    var accumulator = 1
    for (i in 1..number) {
        accumulator = accumulator * i
    }

    return accumulator
}

fun factorial2(number: Int): Int {
    if (number <=1) {
        return 1
    }
    return factorial2(number - 1) * number
}

// Default arguments
fun openBrowser(url: String, incognitoMode: Boolean = false) {

    println("Opening $url" + if (incognitoMode) " in incognito mode" else "")

    // ...
}

fun cheer(how: String = "Hello, ", who: String = "World") {

    print("$how $who")
}

fun main() {
    val height = 5
    for (i in 1..height) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }

    printStars(5)

    val factorial5 = factorial(5)
    println("Factorial of 5 is $factorial5")

    val factorial4 = factorial2(4)
    println("Factorial of 4 is $factorial4")

    openBrowser("website2.com") // Opening website2.com
}