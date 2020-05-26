package questions

object q4 extends App {
  evenAndOddDriver(5)
  evenAndOddDriver(16)


  def evenAndOddDriver(num: Int): Unit = {
    num match {
      case 0 => println("zero is not even or odd")
      case num if evenAndOdd(num) => println("even")
      case _ => println("odd")
    }
  }

  def evenAndOdd(num: Int): Boolean = {
    num match {
      case 0 => return true
      case 1 => return false
      case _ => evenAndOdd(num % 2)
    }
  }
}
