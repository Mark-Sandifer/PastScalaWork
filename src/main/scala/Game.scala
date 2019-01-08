object Game extends App {
  def rng(higher:Int, lower:Int):Int = {
    val computerGuess = scala.util.Random
    computerGuess.nextInt(higher - lower)
  }
  def textgap(){
    println("---")
  }
  def p_input(){
    println("> What will you do?")
    textgap
  }
  def pinitiative():Int = {
    rng(20, 1)
  }
  def einitiative():Int = {
    rng(20, 1)
  }
  def doorint(){
    textgap
    println("> You see a door before you")
    textgap
  }
  def pathing(){
    println("You see a path to the left")
    textgap
    println("You see a path to the right")
  }
  def pHealthCheck(): Unit = {
    playerlife = playerlife - hit
    println(s"The enemy hit you for $hit, your current life total is $playerlife")
    if(playerlife <= 0){
      combat = 0
    }
  }
  def eHealthCheck(): Unit ={
    enemylife = enemylife - hit
    println(s"You hit the enemy for $hit, current enemy life total is $enemylife")
    if(enemylife <= 0){
      combat = 0
    }
  }
  def spellCast(): Unit ={
    cast = 0
    if(cast == 0){
      println(s"What spell do you want to cast? \n1 - Magic Missle.  $mmslots / 2\n2 - Fire Bolt.  $fbslots / 3\n3 - Thunder Bolt.  $tbslots / 1\n4 - Rock Throw.  $rtslots / 4")
      readInt() match{
        case 1 =>
          if(mmslots <= 0){
            println("You attempt to case this spell but you're out of Magic Missle juice!")
          }
          else{
            mmslots = mmslots - 1
            println("You cast Magic Missle!")
            hit = rng(8, 1)
            enemylife = enemylife - hit
            println(s"You hit the enemy for $hit, current enemy life total is $enemylife")
            if(enemylife <= 0){
              combat = 0
            }
          }
        case 2 =>
          if(fbslots <= 0){
            println("You attempt to case this spell but you're out of Fire Bolt juice!")
          }
          else{
            fbslots = fbslots - 1
            println("You cast Fire Bolt!")
            hit = rng(15, 1)
            enemylife = enemylife - hit
            println(s"You hit the enemy for $hit, current enemy life total is $enemylife")
            if(enemylife <= 0){
              combat = 0
            }
          }
        case 3 =>
          if(tbslots <= 0){
            println("You attempt to case this spell but you're out of Thunder Bolt juice!")
          }
          else{
            tbslots = tbslots - 1
            println("You cast Thunder Bolt!")
            hit = rng(5, 3)
            enemylife = enemylife - hit
            println(s"You hit the enemy for $hit, current enemy life total is $enemylife")
            if(enemylife <= 0){
              combat = 0
            }
          }
        case 4 =>
          if(rtslots <= 0){
            println("You attempt to case this spell but you're out of Rock Throw juice!")
          }
          else{
            rtslots = rtslots - 1
            println("You cast Rock Throw!")
            hit = rng(10, 5)
            enemylife = enemylife - hit
            println(s"You hit the enemy for $hit, current enemy life total is $enemylife")
            if(enemylife <= 0){
              combat = 0
            }
          }
        case 5 =>println("You do nothing. Are you trying to get yourself killed?")
      }
    }
  }
  def enemyact(){
    println("Their hit lands!")
    hit = rng(6, 1)
    pHealthCheck()
  }
  def action(){
    println("How do you want to act? \n1 - Attack.\n2 - Block.\n3 - Heal.\n4 - Spell.")
    readInt() match{
      case 1 => println("You attack!")
        println("Your hit lands!")
        hit = rng(6, 1)
        eHealthCheck()
      case 2 => println("You block!")
        println("You prepare youself for an attack")
        pac + 2
      case 3 => println("You tend your wounds!")
        heal = rng (3, 1)
        println(s"You heal for $heal")
        playerlife = playerlife + heal
        println(s"Your current life total is $playerlife")
      case 4 =>spellCast()
      case 5 =>println("You do nothing. Are you trying to get yourself killed?")
    }
  }

  //
  var cast = 0
  var heal = 0
  var choice = 0
  var playeri = pinitiative
  var enemyi = einitiative
  var playerlife = 20
  var enemylife = 20
  var combat = 0
  var pstart = 0
  var estart = 0
  var pac = 13
  var eac = 13
  var hit = 0
  var mmslots = 2
  var fbslots = 3
  var tbslots = 1
  var rtslots = 4
  var instance1 = 0
  var i = 0
  var a_find = "open"
  var b_find = "door"
  var interact1 = 0
  var interact2 = 0
  //

  while(instance1 == 0){
    doorint
    p_input
    var msg= readLine()
    if (interact2 <= 0 && interact1 <= 0){
      while (i < msg.length()-(a_find.length() -1) ){
        if (msg.substring(i, i + a_find.length()) == a_find){
          interact1 += 1
        }
        i += 1
      }
      i = 0
      while (i < msg.length()-(b_find.length() -1) ){
        if (msg.substring(i, i + b_find.length()) == b_find){
          interact2 += 1
        }
        i += 1
      }
      i = 0

    }
    if (interact2 == 1 && interact1 == 1){
      textgap
      println("You open the door")
      println("You are attacked!")
      combat = 1
      instance1 += 1
    }
    else{
      interact1 = 0
      interact2
        = 0
      println("Nothing happens")
    }
  }

  if(playeri > enemyi){
    textgap
    println(s"You rolled $playeri where as the enemy rolled $enemyi. You go first.")
    textgap
  }
  else{
    textgap
    println(s"You rolled $playeri where as the enemy rolled $enemyi. The enemy goes first.")
    textgap
  }
  while(combat == 1){
    if(playeri > enemyi){
      action
      textgap
      enemyact
      textgap
    }
    else{
      enemyact
      textgap
      action
      textgap
    }
  }
  //Instance 1 ends
}
