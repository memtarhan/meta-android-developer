package module1

fun main() {
    /*
    Char

    Char represents a single character. This can be a letter, a number, punctuation or another symbol. A Char value
    can be specified in single quotes. For example, to define a Char variable named myChar with the value set to
    the letter a, you would use the following code:
     */
    val myChar: Char = 'a'

    // String
    val myString = "Hello"

    val age = 70
    val ageString = "My age is $age"
    println(ageString)

    val charToStringValue = myChar.toString()

    // The following example shows how new variables are created when a String is modified.
    var s1 = "Hello"
    val s2 = s1 // s1 and s2 now point at the same string - "Hello"
    println(s1) // prints "Hello"
    println(s2) // prints "Hello"
    s1 += "world" // append "world" to s1
    println(s1) // prints "Hello world"
    println(s2) // still prints "Hello" because s2 still points to the String "Hello" while s1 is a new String object

    val myStringLength = myString.length
    val startsWithHel = myString.startsWith("Hel")
    val endsWithLo = myString.endsWith("lo")
    val firstChar = myString.first()
    val lastChar = myString.last()
    val equalsHello = myString.equals("Hello")
    val myUpperString = myString.uppercase()
    val myLowerString = myString.lowercase()

    /*
    Get all characters from the second character onwards

    Note: Counting starts at zero. myString2 will have the value ello.
     */
    val myString2 = myString.substring(1)

}