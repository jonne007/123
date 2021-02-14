package lesson04
import utest._
import java.math.MathContext

object MyMathSuite extends TestSuite {

  val tests = Tests {
    test("division") - {

      val x = 15
      val y = 3

      val summa = MyMath.division(x, y)

      assert {
        summa == 5
      }
    }
    test("minus") - {

      val x = 10
      val y = 5

      val summa = MyMath.minus(x, y)

      assert {
        summa == 5
      }
    }
    test("multiply") - {

      val x = 5
      val y = 5

      val summa = MyMath.multiply(x, y)

      assert {
        summa == 25
      }
    }
    test("plus") - {

      val x = 2
      val y = 4

      val summa = MyMath.plus(x, y)

      assert {
        summa == 6
      }
    }
  }
}
