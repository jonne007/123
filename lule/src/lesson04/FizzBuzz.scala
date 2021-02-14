package lesson04

object FizzBuzz {

  def fizzBuzz(i: Int): String = {
    val mod3 = i % 3 == 0
    val mod5 = i % 5 == 0
    if (mod3 && mod5)
      "FizzBuzz"
    else if (mod5)
      "Buzz"
    else if (mod3)
      "Fizz"
    else i.toString
  }
}
