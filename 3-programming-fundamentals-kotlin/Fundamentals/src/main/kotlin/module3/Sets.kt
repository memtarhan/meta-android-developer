package module3

fun main() {
    val set = setOf('A', 'B')
    println(set + 'C') // [A, B, C]
    println(set + setOf('C', 'D')) // [A, B, C, D]
    println(setOf('Z') + set) // [Z, A, B]

    println(set.size) // 2

    println(set.size == 0) // false
    println(set.isEmpty()) // false

    println(set.contains('A')) // true
    println(set.contains('Z')) // false

    for (letter in set) {
        print(letter)
    }
}