import org.graalvm.compiler.graph.Node.Input

object MorseCode extends App {
//  def morseCode(input: String): Unit ={
//    input match {
//      case " ._ " =>
//    }
//  }
  def splitSent(input: String): Unit ={
  println(input)
  val retVal = input.split(" / ")
    retVal.foreach(println)
    splitWord(retVal)
  }
  def splitWord(input: Array[String]): Unit ={
    val retVal2 = input.map(input => input.split(" "))
    retVal2.foreach(println)
    if(retVal2 == ".-"){
      println("A")
    }
  }

//  def formSentence(input: String): Unit ={
//
//  }
  splitSent(".- --.- .-. -..- - / .- --. -.-")
}
