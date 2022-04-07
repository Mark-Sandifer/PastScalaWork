import java.sql.{Connection, DriverManager}
Class.forName("com.mysql.jdbc.Driver")
var connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "")
val statement = connection.createStatement
var usern = ""
var usera = ""
var active = 1
var start = 1
var choice = 0
var choice1 = 0
var choice2 = 0
var choice3 = 0
var choice5 = ""
var acno = 0
var dep = 0
var wit = 0
var depbal = 0
var witbal = 0


while (active == 1){
    while(start == 1){
        println("Please choose what you would like to do (1/2/3/4)")
        println("1.Create account")
        println("2.Deposit Money")
        println("3.Withdraw Money")
        choice = readInt()
        choice match{
            case 1 => choice1 += 1
                    start = 0
            case 2 => choice2 += 1
                    start = 0
            case 3 => choice3 += 1
                    start = 0
            case _ => println("Error please input appropiate option")
        }
    }
    while(choice1 == 1){
        println("Input new user name")
        usern = readLine()
        println("Input new user address")
        usera = readLine()
        println(s"Are these details correct: Name: $usern / Address: $usera - Y/N?")
        choice5 = readLine
        choice5 match{
            case "y"|"Y" => println("Details added")
                try {
                    statement.executeUpdate("insert into personal values(NULL, '"+usern+"', '"+usera+"')")
                    val rs = statement.executeQuery("SELECT max(acno) from personal")
                    if (rs.next) {
                    val acno1 = rs.getString("max(acno)")
                    println("Your new account number is: " + acno1)
                    }
                    }  
                    catch {
                        case e: Exception => println("Fail")
                    }
                    choice1 = 0
                    println("Would you like to make another transaction? - Y/N")
                    choice5 = readLine
                    choice5 match{
                        case "y"|"Y" => println("Returning to start")
                            choice1 = 0
                            start += 1
                        case "n"|"N" => println("Goodbye")
                            active = 0
                            choice1 = 0
                        }
            case _|"n"|"N" => println("Ending session")
                choice1 = 0
                active = 0
        }
    }
    while(choice2 == 1){
        println("Please enter account number")
        acno = readInt

        try {
        val aa = statement.executeQuery("SELECT * FROM personal WHERE ACNO = '"+acno+"'")
        while (aa.next) {
            val name1 = aa.getString("Name")
            val address1 = aa.getString("Address")
            println(name1 + "....." + address1)
        }
        }   
        catch {
            case e: Exception => println(e)
        }
    
        println("Please Input deposit amount")
        dep = readInt()

        statement.executeUpdate("insert into deposit values('"+acno+"', '"+dep+"', now())")

        println("Would you like to make another transaction? - Y/N")
        choice5 = readLine
        choice5 match{
            case "y"|"Y" => println("Returning to start")
                choice2 = 0
                start += 1
            case "n"|"N" => println("Goodbye")
                active = 0
                choice2 = 0
        }

    }
    while(choice3 == 1){
        println("Please enter account number")
        acno = readInt

        try {
        val aa = statement.executeQuery("SELECT * FROM personal WHERE ACNO = '"+acno+"'")
        while (aa.next) {
            val name1 = aa.getString("Name")
            val address1 = aa.getString("Address")
            println(name1 + "....." + address1)
        }
        }
        catch {
            case e: Exception => println(e)
        }

        val x1 = statement.executeQuery("select sum(amount) from deposit where ACNO = '"+acno+"'")
        x1.next
        var depbal = x1.getInt("sum(amount)")
        
        val x2 = statement.executeQuery("select sum(amount) from withdraw where ACNO = '"+acno+"'")
        x2.next
        var witbal = x2.getInt("sum(amount)")
        
        var showbal = depbal - witbal
        println("balance is: " + showbal)
        println("Enter desired withdrawel amount")
        wit = readInt()
        if(wit > showbal){
            println("Not enough funds")
        }
        else{
            statement.executeUpdate("insert into withdraw values('"+acno+"', '"+wit+"', now())")
        }
        println("Would you like to make another transaction? - Y/N")
        choice5 = readLine
        choice5 match{
            case "y"|"Y" => println("Returning to start")
                choice3 = 0
                start += 1
            case "n"|"N" => println("Goodbye")
                active = 0
                choice3 = 0
        }
    }
}
