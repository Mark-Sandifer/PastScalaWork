object BasicCalc extends App {
  class Calculator {
    def add( num1:Int, num2:Int ) : Int = {
      var sum = num1 + num2
      println(sum)
      sum
    }
    def subtract( num1:Int, num2:Int ) : Int = {
      var sum = num1 - num2
      println(sum)
      sum
    }
    def divide( num1:Int, num2:Int ) : Int = {
      var sum = num1 / num2
      println(sum)
      sum
    }
    def multiply( num1:Int, num2:Int ) : Int = {
      var sum = num1 * num2
      println(sum)
      sum
    }
  }
  var ref = new Calculator
  println("Select operation.")
  println("Input choice(1/2/3/4)")
  println("1.Add")
  println("2.Subtract")
  println("3.Multiply")
  println("4.Divide")
  readInt() match{
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
}
