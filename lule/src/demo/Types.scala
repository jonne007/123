package demo

object Types {
    var sträng = "Bahamas"
    val annanSträng = "Sri Lanka"
    val pi: Double = 3.14
    val i: Int = 99
    
    val c: Boolean = 42 == 1

    def test () = {
    sträng = "Kenya"
    println(sträng + "GloryManUnited")
    println(annanSträng + "hatbrott")
    println
    println(i + pi)
    
    if(c)
      println("c är 42")
    else
      println("c är inte 42")

    }
}
