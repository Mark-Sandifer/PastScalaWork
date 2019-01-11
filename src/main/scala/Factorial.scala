object Factorial extends App {
  println("Do you want to use a factorial operator or a reverse factorial operator?")
  println("Press 1 for factorial")
  println("Press 2 for reverse factorial")
  readInt() match{
    case 1 =>
      var input = readInt()
      var inputTrack = input
      while(inputTrack > 0){
        if(inputTrack == 1){
          println("End")
        }
        else {
          input = input * (inputTrack - 1)
          println(input)
        }
        inputTrack = inputTrack - 1
      }
    case 2 =>
      var revInput = readInt()
      var revInputTrack = 1
      while(revInput / revInputTrack > 0){
        revInput = revInput / revInputTrack
        revInputTrack = revInputTrack + 1
        println(revInput)
        if(revInput == 1){
          revInputTrack = revInputTrack - 1
          println(s"$revInputTrack!")
        }
      }
  }
}
