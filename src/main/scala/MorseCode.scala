import org.graalvm.compiler.graph.Node.Input

object MorseCode extends App {
  val morseArray = Array(".-")
  def splitSent(input: String): Unit ={
  println(input)
  val retVal = input.split(" / ")
    retVal.foreach(println)
    splitWord(retVal)
  }
  def splitWord(input: Array[String]): Unit ={
    val retVal2 = input.map(input => input.split(" ").foreach(println))
  }

  splitSent(".- --.- .-. -..- - / .- --. -.-")
}
