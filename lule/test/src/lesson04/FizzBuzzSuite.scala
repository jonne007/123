package lesson04
import utest._
object FizzBuzzSuite extends TestSuite {

  val tests = Tests {
    test("fizzybuzzy") - {

      val r1 = FizzBuzz.fizzBuzz(1)
      val r2 = FizzBuzz.fizzBuzz(2)
      val r3 = FizzBuzz.fizzBuzz(3)
      val r4 = FizzBuzz.fizzBuzz(5)
      val r5 = FizzBuzz.fizzBuzz(12)
      val r6 = FizzBuzz.fizzBuzz(13)
      val r7 = FizzBuzz.fizzBuzz(15)

      assert(
        r1 == "1",
        r2 == "2",
        r3 == "Fizz",
        r4 == "Buzz",
        r5 == "Fizz",
        r6 == "13",
        r7 == "FizzBuzz"
      )
    }
  }
}
