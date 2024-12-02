package module1

fun main() {
    val a = 10 // the type of a is Int
    val b = 2147483647L // the type of b is Long
    val c = 10.0 // the type of c is Double
    val d = 10F // the type of d is Float

    // All numbers can be negative, and you can use underscores ('_') inside longer numbers to improve their readability.
    val smallDebt = -0.72
    println(smallDebt) // -0.72
    val million = 1_000_000
    println(million) // 1000000

    // Transforming
    val i: Int = 10
    val l: Long = i.toLong()
    val d1: Double = i.toDouble()
    val d2: Double = l.toDouble()
    println(d1) // 10.0
    println(d2) // 10.0

//    var a = 10
//    println(a) // 10
//    a *= 3
//    println(a) // 30
//    a -= 12
//    println(a) // 18
//    a /= 3
//    println(a) // 6
//    a %= 4
//    println(a) // 2
}