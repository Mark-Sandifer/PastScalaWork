//Unfinished Task 2
object ArrayDuplicate extends App {
  val arrayMil = (1 to 1000).toArray[Int]
  arrayMil(456) = arrayMil(235)
  val place = 1
  for(i <- place until arrayMil.length){
    println(i)
  }
}
