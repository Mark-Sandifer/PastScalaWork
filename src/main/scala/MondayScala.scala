object MondayScala extends App {
  //Hello World!
  println("Hello World")
  //Assignment
  val helloW = println("Hello World!")
  helloW
  //Parameters
  def stringMethod(strElement: String)= {
    println(strElement)
  }
  stringMethod("This is a test")
  //Return Types
  def add( num1:Int, num2:Int ) : Int = {
    val sum = num1 + num2
    println(sum)
    sum
  }
  add(12, 12)
  //Type Inference
  def parameterInference(c: Any) = c match {
    case c: Int => println("This is an Int")
    case c: Double => println("This is a double")
    case c: String => println("This is a string")
    case c: Boolean => println("This is a Boolean")
    case _ => println("Error.")
  }
  parameterInference(1)
  parameterInference(1.1)
  parameterInference("Test")
  parameterInference(true)
  //Strings
  /*def stringCharCount (d: String, e:Int): String = {
    var result =

  }*/
}
