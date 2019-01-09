object NinetyNineBottles extends App {

  def song () ={
    val beer = (99 to 1 by -1).toArray[Int]
    beer.foreach(beer => println(s"$beer bottles of beer on the wall, $beer bottles of beer.\nTake one down and pass it around, ${beer - 1} bottles of beer on the wall."))
    println("No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.")
  }
  song()
}


