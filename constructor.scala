class DemoClass {

  var x =10
  var y =23

  def add(x:Int,y:Int)=x+y

  println(x +" and " + y)

  val z=add(x,y)
  println(z)

}




object constructor {
  def main(args: Array[String]): Unit = {
    println("Hello World")

    val demo1=new DemoClass; //Creating an object will call constructor automatically

  }

}
