package module3

data class Dog3(
    val name: String,
    val age: Int
)

class ValueClass(val value: Int)
data class ValueDataClass(val value: Int)

fun main() {
    val dog = Dog3("Pluto", 7)
    val (name, age) = dog
    println(name)
    println(age)
    /*
    Beware that destructuring in Kotlin is based on position, not name, so value names need to be placed
    at correct positions. For instance, if you place age at the position of name, and name at the position of age,
    then you will have age in a variable called name, and name in the variable called age.
     */


    val value1 = ValueClass(42)
    val value2 = ValueClass(42)
    println(value1 == value2) // False

    val value3 = ValueDataClass(42)
    val value4 = ValueDataClass(42)
    println(value3 == value4) // True
}