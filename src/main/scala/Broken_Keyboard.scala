import scala.io.Source
object Broken_Keyboard extends App {
  val ngram = Source.fromFile("C:\\Users\\Admin\\Desktop\\enable1.txt").getLines.toList
  val search = Source.fromFile("C:\\Users\\Admin\\Desktop\\search.txt").getLines.toList
  println(ngram.length)
  println(ngram(0))
  println(search(0))


}
