package functional_programming

object RecurciveFunction {

  def factorial(n:Int): Int = {
  if(n<=1){ 1}
  else {
    n*factorial(n-1)
  }
  }

  def main(args: Array[String]): Unit = {
      println(factorial(5))
  }

}
