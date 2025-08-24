class Cars(color:String,Brand:String,wide:Int) {
//Auxiliary constructor 1
  def this(wide:Int)= {
    this("UNknown","unknown",wide)
  }

  //Auxiliary constructor 2
  def this(length:Int,breadth:Int)={
    this("unknown","unknown",length+breadth)
  }

}


object democonstructor1 {
  def main(args: Array[String]): Unit = {
    var car1=new Cars("Red","suzuki",12)
    var car2=new Cars(12)
    var car3=new Cars(23,89)
    println(car1)
    println(car2)
    println(car3)

  }
}
