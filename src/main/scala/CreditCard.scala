object CreditCard extends App {
  def algorithm(input: Long): List[Long] = {
    val digits = input.toString.toList.map(_.toString).map(_.toLong)
    digits
  }
  def run(alg:Long): Unit ={
    odds(algorithm(alg))
    evens(algorithm(alg))
  }
  def odds(ccNo1: List[Long]): Unit = {
    var j = 0
    while(j < ccNo1.length){
      total = total + ccNo1.reverse(j)
      j+=2
    }
  }
  def evens(ccNo2: List[Long]): Unit = {
    var i = 1
    while(i < ccNo2.length){
      calc(ccNo2.reverse(i))
      i+=2
    }
    ccNo2
  }
  def calc(num:Long): Unit ={
    var sum = num * 2
    if(sum / 10 == 1){
      sum = sum - 10 + 1
    }
    total = total + sum
  }
  var total:Long = 0
  run(5204408086566492L)
  if(total % 10 == 0){
    println("This card is valid")
  }
  else{
    println("This card is not valid")
  }
}
