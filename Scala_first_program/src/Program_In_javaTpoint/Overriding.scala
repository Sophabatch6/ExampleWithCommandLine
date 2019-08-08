package Program_In_javaTpoint

class Overriding {
  def run (): Unit ={
    println("Vehicle is running")
  }
}
class Bike extends Overriding{
  override def run(): Unit = {
    println("Bike is running")
  }
}
object mainObject{
  def main(args: Array[String]): Unit = {
    var b = new Bike()
    b.run()
  }
}
