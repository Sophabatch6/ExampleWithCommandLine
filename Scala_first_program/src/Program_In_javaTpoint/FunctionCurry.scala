package Program_In_javaTpoint

object FunctionCurry{
  def add(a:Int)(b : Int): Int ={
    a+b
  }

   def main(args: Array[String]): Unit = {
    var result = add(10)(10)
    println(result)
    var addIt = add(10)_
     println(addIt)
    var result2 = addIt(3)
    println(result2)
  }
}
