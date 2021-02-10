package demo
import scala.io.StdIn.readLine

object Quiz {

  def start() = {
      var resultat = 0
      
   
    
    println(
      "Svara genom att ange ett av svarsalternativen (1),(x) eller (2). Rätt svar ger 1 poäng"
    )

    val guess1 = readLine("""Flest mål i svenska landslaget?
    1. Zlatan
    x. Henke
    2. Ljungberg
    Svar: """)

    if (guess1 == "1") { 
        resultat = resultat + 1
      println("Korrekt")
    } else {  
      println("Idiot")
    }

    val guess2 = readLine("""Finns hästar?
    1. Ja
    x. Nej
    2.Hästar är en frukt 
    Svar: """)

    if (guess2 == "2")  {
        resultat = resultat + 1
      println("Korrekt")
    } else {
      println("Idiot")
    }

    val guess3 = readLine("""Vilken svensk stad vann flest OS medaljer i Pyeongchang OS ?
    1. Piteå
    x. Stockholm
    2. Mora
    Svar: """)

    if (guess3 == "1") {
        resultat = resultat + 1
      println("Korrekt")
    } else {
      println("Idiot")
    }

    val guess4 = readLine("""Längsta människan någonsin? 
    1. Robert Wadlow
    x. Robert Langdon
    2. Robert Levingood
    Svar: """)

    if (guess4 == "1") {
        resultat = resultat + 1
      println("Korrekt")
    } else {
      println("Idiot")
    }
   
      println(s"$resultat Poäng")  
    


  }
}