package module3

/*
In some cases, you need to represent a pair of values. For that, a class you can use is the Pair class. This is
a data class with two constructor properties, you do not need to define it, as it is distributed with Kotlin.

In the below example, a pair with values of type Double and Char is created. You can read those values
using first and second properties. You can also destructure it into variables.
 */

fun main() {
    // Pair
    val pair = Pair(1.0, 'A')
    println(pair.first) // 1.0
    println(pair.second) // A

    val (number, letter) = pair
    println(number) // 1.0
    println(letter) // A

    // There is also another way to create a pair: by placing the to function between two values.
    // The result is a pair of those two values.
    val pair2 = 1.0 to 'A'

//    // Triple
//    val pair3 = Triple(1F, "ABC", true)
//    println(pair.first) // 1.0
//    println(pair.second) // ABC
//    println(pair.third) // true
//    val (num, letters, boolean) = pair3
//    println(number) // 1.0
//    println(letters) // ABC
//    println(boolean) // true
}