package module3

enum class WeekDay {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

enum class PizzaSize(
    val sizeInCm: Int
) {
    SMALL(15),
    MEDIUM(20),
    LARGE(25),
    EXTRA_LARGE(30)
}

fun printSize(pizzaSize: PizzaSize) {
    println("$pizzaSize is ${pizzaSize.sizeInCm} cm")
}

fun main() {
    printSize(PizzaSize.MEDIUM) // MEDIUM is 20 cm
    printSize(PizzaSize.EXTRA_LARGE) // EXTRALARGE is 30 cm

    println(WeekDay.MONDAY) // MONDAY
    println(WeekDay.MONDAY.ordinal) // 1

    for (day in WeekDay.values()) {
        println(day)
    }
}