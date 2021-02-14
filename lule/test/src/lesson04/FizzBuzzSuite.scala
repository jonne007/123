package lesson04
import utest._
object FizzBuzzSuite extends TestSuite {

  val tests = Tests {
    test("fizzybuzzy") - {

      val x = (1-15)
      

      val res = FizzBuzz.fizzBuzz(x)

      assert {
        FizzBuzz.fizzBuzz(1) == "1"
        FizzBuzz.fizzBuzz(2) == "2"
        FizzBuzz.fizzBuzz(3) == "Fizz"
        FizzBuzz.fizzBuzz(5) == "Buzz"
        FizzBuzz.fizzBuzz(12) == "Fizz"
        FizzBuzz.fizzBuzz(13) == "13"
       // FizzBuzz.fizzBuzz(15) == "FizzBuzz"
      }
    }
  }
}
