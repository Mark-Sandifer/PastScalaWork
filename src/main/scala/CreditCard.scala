object CreditCard extends App {
  //Unfinished
  def algorithm(input: Long): List[Long] = {
    val digits = (input.toString).toList.map(_.toString).map(_.toLong)
    val checkDigit: Long = digits.last

    println(digits)

    digits
  }
  algorithm(5204408086566492L)
}

