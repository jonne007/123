package lesson03
import scala.io.StdIn.readLine
import utest._

object PingPongSuite extends TestSuite {
  val tests = Tests {
    test("what") - {

      val x = ("ruuuur")

      var r = PingPong.hello(x)

      assert {
        r == "what"
      }
    }
    test("pong") - {

      val x = ("pong")

      var r = PingPong.hello(x)

      assert {
        r == "ping"
      }
    }

    test("ping") - {

      val x = ("ping")

      var r = PingPong.hello(x)

      assert {
        r == "pong"
      }
    }
  }
}
