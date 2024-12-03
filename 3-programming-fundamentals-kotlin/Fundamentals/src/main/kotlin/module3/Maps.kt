package module3

fun main() {
    val capitals = mapOf("USA" to "Washington", "Poland" to "Warsaw", "Ukraine" to "Kyiv")
    println(capitals) // {USA=Washington, Poland=Warsaw, Ukraine=Kyiv}

//    val capitals = mapOf(
//        Pair("USA", "Washington"),
//        Pair("Poland", "Warsaw"),
//        Pair("Ukraine", "Kyiv")
//    )

    val alphabet: Map<Char, Int> = mapOf('A' to 1, 'B' to 2, 'C' to 3)
    println(alphabet) // {A=1, B=2, C=3}
    val number: Int? = alphabet['A']
    println(number) // 1
    println(alphabet['B']) // 2
    println(alphabet['&']) // null

    // Adding elements to a map
    val map1 = mapOf('A' to "Alex", 'B' to "Bob")
    val map2 = map1 + ('C' to "Celina")
    println(map1) // {A=Alex, B=Bob}
    println(map2) // {A=Alex, B=Bob, C=Celina}
    val map3 = mapOf('D' to "Daniel", 'E' to "Ellen")
    val map4 = map2 + map3
    println(map3) // {D=Daniel, E=Ellen}
    println(map4) // {A=Alex, B=Bob, C=Celina, D=Daniel, E=Ellen}
    // Beware that duplicated keys are not allowed, so when you add a new association, it removes the old one.

    val map5 = mapOf('A' to "Alex", 'B' to "Bob")
    val map6 = map1 - 'B'
    println(map1) // {A=Alex, B=Bob}
    println(map2) // {A=Alex}

    println('A' in map5) // true
    println('Z' in map5) // false

    println(map5.size) // 2

    for (entry in map5) {
        println("${entry.key} is for ${entry.value}")
    }

    for ((letter, name) in map5) {
        println("$letter is for $name")
    }
}