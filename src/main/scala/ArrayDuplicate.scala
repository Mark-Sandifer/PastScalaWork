object ArrayDuplicate extends App {
  def arrayDup(input: Array[Int]): Boolean = {
    val arrayLength = input.length
    var finder1 = 0
    var dupFound = false
    while (finder1 < arrayLength && !dupFound) {
      var finder2 = finder1 + 1
      while (finder2 < arrayLength && !dupFound) {
        if (input(finder1) == input(finder2)) {
          dupFound = true
        }
        finder2 += 1
      }
      finder1 += 1
    }
    dupFound
  }
  val arrayTest = Array(2,5,6,8,4,23,3,6,7,2,3)
  arrayDup(arrayTest)
}