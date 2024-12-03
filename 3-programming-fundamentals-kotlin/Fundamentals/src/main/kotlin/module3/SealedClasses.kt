package module3

/*
Consider that you try to make a network operation. The result is either a success or a failure. You do not want to
allow anyone to define any other subclasses. That is a case for using a sealed modifier instead of abstract.
 */

sealed class Result
class Success(val data: String) : Result()
class Failure(val exception: Throwable) : Result()

/*
A sealed modifier used in front of a class behaves just like abstract, but it also introduces some limitations.

Officially subclasses of a sealed class need to be defined in the same package. What is more important is that
a sealed modifier is information to the developer who reads the code - it informs them that this class
has a limited number of subclasses known in advance during compilation.
 */

fun constructLabel(role: String, name: String): String {
    return when (role) {
        "ceo" -> "The boss"
        "manager" -> "Manager $name"
        "worker" -> name
        else -> "Unknown role"
    }
}

fun main() {
    val label = constructLabel("manager", "Leonard")
    println(label) // Manager Leonard
}