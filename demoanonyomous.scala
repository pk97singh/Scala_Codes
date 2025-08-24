package functional_programming

object demoanonyomous {
  def main(args: Array[String]): Unit = {
    println("Hello World")
    var increament=(x:Int)=>{
      print("value is " + x);
      x+1
    }
    var add=(x:Int,y:Int)=>x+y
    add(2,3)
  }
var my_print=()=>println("Hi")
  my_print()
}
