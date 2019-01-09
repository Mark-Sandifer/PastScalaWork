import scala.collection.mutable.ArrayBuffer
import scala.io.Source
object Broken_Keyboard extends App {
  val listOfWords = Source.fromFile("C:\\Users\\Admin\\Desktop\\enable1.txt").getLines.toList
  val keyboardKeys = "alep".toArray
  var longestWord = ""
  checkWord()

  def checkWord():Unit = {
    for (word <- listOfWords) {
      val containsLetters = ArrayBuffer[Boolean]()
      for (letter <- keyboardKeys) {
        if (word.contains(letter)) containsLetters.append(true)
        else containsLetters.append(false)
      }
      if (containsLetters.exists(value => value) && longestWord.length < word.length) {
        longestWord = word
      }
    }
    println(longestWord)
  }
}
