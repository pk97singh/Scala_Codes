class CompanionClass {
  val x=10
  def print_value()={
  print("x from class"+x +"y from object " + CompanionClass.y)}
}


object CompanionClass {
  val y=90
  def main(args: Array[String]): Unit = {
    var cc=new CompanionClass
    println(cc.x)
    cc.print_value()
  }

}
