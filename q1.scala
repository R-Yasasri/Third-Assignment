package questions

object q1 extends App {
  prime(5)
  prime(8)

  def prime(num: Int, n: Int = 2): Unit = {

    n match {
      case x if num == n => println("true")
      case x if gcd(num, n) > 1 => println("false")
      case _ => prime(num, n + 1)
    }
  }

  def gcd(a: Int, b: Int): Int = {

    b match {
      case 0 => return a
      case b if a % b == 0 => return b
      case _ => return gcd(b, a % b)
    }

  }

}
