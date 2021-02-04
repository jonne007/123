import scala.io.StdIn.readLine

object HelloInteractive extends App {

    print("Enter your first name: ")
    val firstName = readLine()

    print("Enter your last name: ")
    val lastName = readLine()

    println(s"Your name is $firstName $lastName")

  val a = firstName.equalsIgnoreCase("Kalle")
  val b = firstName.equalsIgnoreCase("Kurt")
  val c = firstName.equalsIgnoreCase("Bengt")
  val d = firstName.exists(c => 'n' == c)
  val resultat = if (a)
    (s"Your name is $firstName $lastName and you are King!")
  else if (b)
    (s"Your name is $firstName $lastName and you are Queen! 👸")
  else if (d)
    (s"du är inte vacker")
  else
    (s"Your name is $firstName $lastName!")

    println(resultat)


 }