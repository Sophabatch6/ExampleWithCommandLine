package Program_In_javaTpoint

object function {
  def main(args:Array[String]): Unit ={
    var result1 = functionExample(12,12)
    var result2 = functionExample(12)
    var result3 = functionExample()
    println(result1+"\n"+result2+"\n"+result3)
  }
  def functionExample(a :Int=0 ,b : Int=0):Int={
    a+b
  }
}
