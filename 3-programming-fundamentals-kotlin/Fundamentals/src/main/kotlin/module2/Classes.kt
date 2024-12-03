package module2

class Subject(
    val name: String,
    val teacher: Teacher,
    val isObligatory: Boolean
)

class Teacher(
    val name: String,
    val surname: String,
    val birthday: String,
    val status: String
)

class Student(
    val id: Int,
    val name: String,
    val surname: String
)

class Grade(val points: Int, val studentId: Int, val topicId: Int)

// Methods

/*
Receiver

If you want to call a method, you need to have an object. You can then call this method on an object.

For instance, when you have a class Dog with a method feed, to call this method outside the class,
you need to first have an object of type Dog.
 */

class Dog(val name: String) {
    var hunger = 62

    fun feed() {
        println("Feeding $name")
        hunger = 0
    }
}

fun feed(dog: Dog) {
    println("Feeding ${dog.name}")
    dog.hunger = 0
}
fun main() {
    val remigiuszFrost =
        Teacher(name = "Remigiusz", surname = "Frost", birthday = "23.07.1987", status = "ACTIVE")
    val biology1 = Subject(name = "Biology 1", teacher = remigiuszFrost, isObligatory = true)
    println(biology1.isObligatory) // true
    println(biology1.teacher.birthday) // 23.07.1987
    println(biology1.teacher.status) // ACTIVE

    val dog = Dog("Rex")

    dog.feed() // Feeding Rex
}