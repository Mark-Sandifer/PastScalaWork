import java.io.{BufferedWriter, File, FileWriter}
import scala.io.Source
//Ignore this I was just bored and wanted to learn how to read and write text documents :)
object ReadWrite extends App {
  val readFile = Source.fromFile("C:\\Users\\Admin\\Desktop\\enable1.txt").getLines.toList
  val file = new File("Insert desired file name here")
  val bw = new BufferedWriter(new FileWriter(file))
  bw.write("Enter contents of file here")
  bw.close()

}
