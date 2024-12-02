package module1

fun main() {

    // while loop
    var toBePrinted = true
    while (toBePrinted) {
        println("Will be printed once")
        toBePrinted = false
    }

    var printedTimes = 0
    while (printedTimes <= 2) {
        println("Line $printedTimes");
        printedTimes += 1
        // or
        // printedTimes = printedTimes + 1
    }

    var i = 1
    while (i * i <= 100) {
        println(i * 1)
        i++
    }

    println("-------------------")

    val a = 0
    val b = 5
    for (i in a..b) {
        print("$i ")
    }
    println()
    println("-------------------")

    for (i in a until b) {
        print("$i ")
    }
    println()

    println("-------------------")

    for (i in a downTo b) {
        print("$i ")
    }
    println()

    println("-------------------")

    val height = 10
    for (i in 1..height) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }

    println()

    println("-------------------")

    for (i in 1..5)
        print(i)
}