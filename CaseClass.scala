case class CaseDemo(var name:String,model:Int) {
  var Car_Name=name
  var my_model=model

  def show(): Unit = {
    println(s"car name is ${Car_Name} or ${name} with model ${my_model}")
  }

}


object CaseClass {
  def main(args: Array[String]): Unit = {
    //mo need for new
    var car1=CaseDemo("bmw",20)
    car1.show()
    //by default constructor param is val , so if we want to change it make it to var name:String
    car1.name="Maruti"
    car1.show()

    car1 match {case CaseDemo(a,b)=>println(a,b)}   //pattern matching

    //Autogenerate copy method
    val mercdex=car1.copy("maruti")
    mercdex.show()

    //euals and hash method
    println(car1==mercdex)

    //tostring is auto imeplemeted
    print(car1)


  }

}
