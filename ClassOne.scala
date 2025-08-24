package Practice

class ClassOne extends Switchcompany {
   var first_name="prince"
   var organisation="Altimetrik"

  override def new_Company: String = "Accenture"
  def msg(): Unit = {
    super.print_new_organisation() //call the trait method with overridden company
  }
}

object final_call{
  def main(args: Array[String]): Unit = {
   val Classone1=new ClassOne()
    Classone1.msg()

  }
}
