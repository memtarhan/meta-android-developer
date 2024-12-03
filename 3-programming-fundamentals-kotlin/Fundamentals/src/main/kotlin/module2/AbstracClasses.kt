package module2

abstract class ShapeDrawer {
    fun drawSquare(){
        drawLine()
    }
    fun drawRectangle(){
        drawLine()
    }
    internal abstract fun drawLine()
}
class AndroidShapeDrawer():ShapeDrawer(){

    override fun drawLine() {
        //code that draw lines for android platform
        println("Test code -Draw line for  android platform")
    }
}
class DesktopShapeDrawer():ShapeDrawer(){
    override fun drawLine() {
        //code that draw lines for android platform
        println("Test code -Draw line for  desktop platform")
    }
}

/*

Interface VS. Abstract class

------Interface                                     ------Abstract class
All methods are open                                Methods can be open or non open
Methods and members are abstracted by default       Methods and members can be abstract or non abstract
A class can implement one or more interface         A class can only be inherited  from one class

 */

abstract class SomeAbstractClass {
    abstract fun abstractMethod()
    fun callAbstractTwice() {
        abstractMethod() // You can use abstract methods inside the class, because it is assumed they
        // will be overridden in the child class.
        abstractMethod()
    }
}

class SomeRegularClass : SomeAbstractClass() {
    override fun abstractMethod() {
        println("Calling abstract method")
    }
}

fun main(){
    val androidDrawer:ShapeDrawer = AndroidShapeDrawer()
    androidDrawer.drawSquare()
    val desktopDrawer:ShapeDrawer = DesktopShapeDrawer()
    desktopDrawer.drawSquare()

    val regular = SomeRegularClass()
    regular.abstractMethod() // Calling abstract method
    regular.callAbstractTwice()
    // Calling abstract method
    // Calling abstract method
}