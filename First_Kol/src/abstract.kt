abstract class Animal{
    abstract fun eat()
    fun drink(){
        println("Drink Water")
    }
}
class Beer:Animal(){
    override fun eat() {
        println("I eat Veg....")
    }
}
class Lion:Animal(){
    override fun eat() {
        println("Eat anything but not veg....")
    }
}
fun main(arr:Array<String>){
    var b = Beer()
    var l = Lion()
    b.eat()
    b.drink()
    l.eat()
    l.drink()
}