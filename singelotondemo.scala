//object that exists with only one instance.

object demosingelton {
  val x=10
  val y=12

  def add(x:Int,y:Int)=x+y
}


object singelotondemo {
  def main(args: Array[String]): Unit = {

    println(demosingelton.x +" "+demosingelton.y)
    println(demosingelton.add(90,80))

  }

}
