// variable declared outside function
object closure {
  var div=2
  var iseven=(x:Int)=>x%div==0
  def main(args: Array[String]): Unit = {
    println(iseven(2))
    println(iseven(5))

  }

}
