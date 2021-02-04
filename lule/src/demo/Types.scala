package demo

// Build in types:
// Byte
// Int
// Long
// Short
// Double 
// Float 
// Char
// String

object Types {
    var sträng = "Bahamas"
    val annanSträng = "Sri Lanka"
    val pi: Double = 3.14
    val i: Int = 99
    val name = "Jonas " + "Bengt " + "Nordsten"   
    val katter: Boolean = 14 == 4
    val speech = """3 myror är 
faktiskt inte 
mer än fyra
elefanter
asdadsasda
asdasdasd
asdasdasd"""      //mupphjärna

    var firstName = "Jonas"
    var mi = "Bengan"
    var lastName = "Nordsten"
    
    val supernamn = s"$firstName $mi $lastName"
   // String interpolation är kex.
     val ints = List(1, 2, 3) 

    def test () = {
    sträng = "Kenya"
    println(sträng + "GloryManUnited")

    println(annanSträng + "hatbrott")

    println(i + pi)

    println(name)

    if(katter)
      println("katter är 14")
    else
      println("katter är inte 14")

    println(speech + "kinesiska naken hundar")

    System.err.println("satan, det där gick ju inte som jag tänkt mig")

    println(ints)

    println(supernamn)

    }
}
