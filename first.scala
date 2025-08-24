
object first {
  def main(args:Array[String]):Unit={
      println("hello")

    println("addition ="+ cal_age(2,3))
    println("without return type ="+ add(4,5))
    println("adda ="+ adda(5,6))
    println("addd =" + add(5,6))
  }
//with return type
  def cal_age(x:Int,y:Int):Int={
    return  x+y
  }

  //No need to specify return type
  def adda(x: Int, y: Int): Int = {
    var z = x + y
    z
  }

  //No need to specify return type
  def add(x:Int,y:Int)   = {
     var z=x+y
     z
  }


}
