package demo

import utest._

object ListsSuite extends TestSuite {
  val tests = Tests {

    test("endsWith") - {

      val list = List(11, 12, 33, 44, 55)

      var r = Lists.endsWith(3, list)

      assert {

        r == List(33)
      }
    }

    test("dropRight") - {

      val list = List(1, 2, 3, 4, 5, 6, 7)

      var r = Lists.dropsRight(4, list)

      assert {

        r == List(1, 2, 3)
      }
    }

    test("lägg till element sist i listan") - {

      val list = List(1, 2)

      var r = Lists.addLast(3, list)

      assert {
        r == List(1, 2, 3)
      }
  }

    test("lägg till element först i listan") - {

      val list = List(2, 3)

      var r = Lists.addFirst(1, list)

      assert {
        r == List(1, 2, 3)
      }
    }
    test("hitta unika värden i lsita") - {

      val list = List(1, 1, 2, 2, 3, 3, 4, 5, 6)

      var r = Lists.distinct(list)

      assert {
        r == List(1, 2, 3, 4, 5, 6)
      }
    }
    test("hämta element på index n") - {
      val list = List(1, 2, 3, 4, 5, 6, 7)

      var r = Lists.apply(2, list)

      assert {
        r == 3
      }
    }
    test("droppa x antal element ur listan och retunera resten") - {
      val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

      val r = Lists.drop(4, list)

      assert {
        r == List(5, 6, 7, 8, 9, 10)
      }

    }

    test("ta x antal element ur listan{take}") - {
      val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

      var r = Lists.take(5, list)

      assert {
        r == List(1, 2, 3, 4, 5)
      }

    }
    test("head betyder huvud") - {
      val list = List(1, 2, 3)

      var r = Lists.head(list)

      assert {
        r == 1
      }
    }

    test("tail betyder svans") - {

      val list = List(1, 2, 3)

      val r = Lists.tail(list)

      assert {
        r == List(2, 3)
      }
    }
    test("reverse list") - {
      val list = List(1, 2, 3)

      val result = Lists.reverse(list)

      assert {
        result == List(3, 2, 1)
      }
    }
    test("list contains") - {
      val list = List(1, 2, 3)

      val result = Lists.contains(2, list)

      assert {
        result == true
      }
    }
    test("list not contains") - {
      val list = List(1, 2, 3)

      val result = Lists.contains(10, list)

      assert {
        result == false
      }
    }
    test("join") - {
      val list1 = List(1, 2)
      val list2 = List(3, 4)

      val result = Lists.join(list1, list2)

      assert {
        result == List(1, 2, 3, 4)
      }
    }
  }
}
