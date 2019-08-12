package Program_In_javaTpoint

object Pattern_matching {
  def main(args:Array[String]){
    var a =3
    a match {
      case 1 => println("One")
      case 2 => println("Two")
      case 3 => println("Three")
      case _ => println("No")

    }
  }

}
