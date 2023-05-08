package week1

// Variables, values and types
fun main() {
    // Variables
    val name = "Leonardo"
    var age = 42

    println("$name's age is $age")

    // A year passes
    age += 1
    println("$name's age a year later is $age")

    var a = 10
    var b = a
    a = 20
    //Changing a does not change b
    println(b) // 10

    var str = "ABC" // The type of str is String
    str = "XYZ"
    // str = 42 // ERROR! Int value cannot be assigned to a variable of type String
    // str = true // ERROR! Boolean value cannot be assigned to a variable of type String

    val age2: String = "" + 42 + "!"
    println(age2)

    // any type
    var x: Any = "ABC"
    println(x) // ABD
    x = 123
    println(x) // 123
    x = true
    println(x) // true
}