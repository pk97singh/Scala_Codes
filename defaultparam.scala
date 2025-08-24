package functional_programming

object defaultparam {
  def add(x:Int=9,y:Int=8):Int  = {
        return x+y
  }

  def main(args: Array[String]): Unit = {
    print(add())
  }
}
