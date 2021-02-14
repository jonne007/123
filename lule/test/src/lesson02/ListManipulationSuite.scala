package lesson02

import utest._

object ListManipulationSuite extends TestSuite {

  val tests = Tests {
    test("filter 2 över 100 under 200") - {
      val minlista = List(1, 2, 3, 102, 162, 222)

      val resultat = ListManipulation.filterEvenNumbersContaining2BiggerThan100SmallerThan200(minlista)

        assert {
          resultat == List(102, 162)
        }
    }
    test("filter 2or över 100") - {
      val minlista = List(1, 2, 3, 102, 162, 222)

      val resultat =
        ListManipulation.filterEvenNumbersContaining2BiggerThan100(minlista)

      assert {
        resultat == List(102, 162, 222)
      }
    }
    test("filter evennumbercontaning2") - {
      val minlista = List(1, 2, 4, 11, 22, 111, 222)

      val resultat =
        ListManipulation.filterEvenNumbersContaining2(minlista)

      assert {
        resultat == List(2, 22, 222)
      }
    }
    test("filter oddnumbers") - {
      val minlista = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

      val restultat = ListManipulation.filterOddNumbers(minlista)

      assert {
        restultat == List(1, 3, 5, 7, 9)
      }

    }
    test("filter evennumbers") - {
      val minlista = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

      val resultat = ListManipulation.filterEvenNumbers(minlista)

      assert {
        resultat == List(2, 4, 6, 8, 10)
      }
    }
  }
}
