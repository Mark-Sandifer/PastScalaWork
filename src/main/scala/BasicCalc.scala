object BasicCalc extends App {
  class Calculator {
    def add( a:Int, b:Int ) : Int = {
      var sum:Int = 0
      sum = a + b
      println(sum)
      return sum
    }
    def subtract( a:Int, b:Int ) : Int = {
      var sum:Int = 0
      sum = a - b
      println(sum)
      return sum
    }
    def divide( a:Int, b:Int ) : Int = {
      var sum:Int = 0
      sum = a / b
      println(sum)
      return sum
    }
    def multiply( a:Int, b:Int ) : Int = {
      var sum:Int = 0
      sum = a * b
      println(sum)
      return sum
    }
  }
  var ref = new Calculator
  println("Select operation.")
  println("Input choice(1/2/3/4)")
  println("1.Add")
  println("2.Subtract")
  println("3.Multiply")
  println("4.Divide")
  val choice = readInt()
  var result = 0
  choice match{
    case 1 => println("Enter First and second number")
      ref.add(readInt, readInt)
    case 2 => println("Enter First and second number")
      ref.subtract(readInt, readInt)
    case 3 => println("Enter First and second number")
      ref.multiply(readInt, readInt)
    case 4 => println("Enter First and second number")
      ref.divide(readInt, readInt)
    case _ => println("Error. Please Choose Appropriate action.")
  }
  //
  while(result > 0){
    println(s"Current Result value: $result")
    println("Select operation.")
    println("1.Add")
    println("2.Subtract")
    println("3.Multiply")
    println("4.Divide")
    println("Input choice(1/2/3/4)")
    val choice = readInt()

    choice match{
      case 1 => println(s"Current Result value: $result")
        val a = result
        println("Please Input the second number")
        val b = readInt()

      case 2 => println(s"Current Result value: $result")
        val a = result
        println("Please Input the second number")
        val b = readInt()

      case 3 => println(s"Current Result value: $result")
        val a = result
        println("Please Input the second number")
        val b = readInt()

      case 4 => println(s"Current Result value: $result")
        val a = result
        println("Please Input the second number")
        val b = readInt()
    }
  }
}
