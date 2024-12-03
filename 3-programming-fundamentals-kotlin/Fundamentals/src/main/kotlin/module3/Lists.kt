package module3

fun main() {
    var list = listOf("A", "B", "C")
    println(list) // [A, B, C]

    val numbers: List<Int> = listOf(1, 2, 3)

    list = list + "D"
    println(list) // [A, B, C, D]

    val size = list.size
    println(size) // 4

    println(list[0]) // A
    println(list[1]) // B
    println(list[2]) // C

    println(list.contains("A")) // true
    println(list.contains("Z")) // false
    println("A" !in list) // false
    println("Z" !in list) // true

    val letters = listOf("A", "B", "C")
    for (letter in letters) {
        print(letter)
    }

    val mutableList = mutableListOf("A", "B")
}