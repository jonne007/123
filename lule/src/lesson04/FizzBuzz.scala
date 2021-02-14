package lesson04

object FizzBuzz {

  def fizzBuzz(i: Int): String = {
    if (i % 3 == 0)
      "Fizz"
    else if (i % 5 == 0)
      "Buzz"
    else i.toString
  }
}
