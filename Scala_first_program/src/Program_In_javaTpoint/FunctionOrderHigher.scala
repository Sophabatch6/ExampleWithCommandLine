package Program_In_javaTpoint


 object FunctionOrderHigher {
   def main(args: Array[String]): Unit = {
     functionExample(25, multiplyBy2) //Passing a function as parameter
     println(multiplyBy2(add2(10)))

   }
   def functionExample(a:Int,f:Int=>AnyVal): Unit ={
     println(f(a))//Calling that function
   }
   def multiplyBy2(a:Int):Int={
     a*2
   }
   def add2 (a:Int):Int ={
     a +2
   }

 }
