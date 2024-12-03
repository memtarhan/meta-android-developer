package module2

interface Animal

class Cat(val name: String): Animal {
    fun retrieve(item: String) {
        println("Retrieving $item")
    }
}

fun play(animal: Animal) {
    val cat: Cat =
        animal as Cat // Do that ONLY when you know an object is of the type you are casting to
    cat.retrieve("stick")
}

open class Mammal {
    fun feedChildren() {}
}

class Dog2: Mammal() {
    fun fetchStick() {}
}

fun feed(mammal: Mammal) {
    mammal.feedChildren()
}

open class P {
    fun a() {}
}

open class C: P() {
    fun b() {}
}

open class D: C() {
    fun u() {}
}

open class SomeClass {
    private val privateProperty = "ABC"
    protected fun protectedFunction() {}
    fun publicFunction() {}
    internal val internalProperty = "ABC"

    fun test() {

    }
}

class ChildClass: SomeClass() {
    fun test2() {
        this.publicFunction()
        this.internalProperty
        this.protectedFunction()
    }
}

fun test() {
    val o = SomeClass()
    o.publicFunction()
    o.internalProperty
}

fun main() {
    val cat: Cat = Cat(name = "Minnos")
    val animal: Animal = cat
//    val cat2: Cat = animal // ERROR!!!

    play(cat)

    val dog = Dog2()
    dog.feedChildren()
    dog.fetchStick()
    feed(dog)

    val o = D()
    o.u()
    o.a()
    o.b()
}