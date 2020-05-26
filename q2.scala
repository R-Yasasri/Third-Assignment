package questions

object q2 extends App {
  primeSeq(10)

  def primeSeq(num: Int): Unit = {

    num match {
      case x if x <= 1 => return
      case x if prime(x) => println(x); primeSeq(num - 1)
      case _ => primeSeq(num - 1)
    }
  }

  def prime(num: Int, n: Int = 2): Boolean = {

    n match {
      case x if num == n => return true
      case x if gcd(num, n) > 1 => return false;
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
