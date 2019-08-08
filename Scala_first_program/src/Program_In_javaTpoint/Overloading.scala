package Program_In_javaTpoint

class Overloading {
  def add ( a: Int, b: Int): Unit ={
    var sum = a + b
    println(sum)
  }
  def add (a: Int, b: Int, c: Int): Unit ={
    var sum  = a + b + c
    println(sum)
  }
}
object MainOveridding{
  def main(args: Array[String]): Unit = {
    var a  = new Overloading();
    a.add(12,23)
    a.add(12,34,23)
  }
}
