class Car {
  var road_tax=100
  var my_cost=50
  private var new_cost=10  //can be accessed with in class
  protected var new_road_tax=90 //in class and by subclass

  def total_cost(baisc_cost:Int)=road_tax+my_cost+baisc_cost+new_cost

  // untintensional done vy mistake
  def check_tax()={
          new_cost=20  //Here how we can access variable even from outside of class
            new_cost

  }

}

class Tesla extends Car{
  print( new_road_tax)
}


object democlassobject {

  def main(args: Array[String]): Unit = {
    var bnw=new Car
    print(bnw.total_cost(9000))
   // bnw.new_cost=90  (will give error due to private)
 var my= new Tesla
 println(my)

    println(bnw.check_tax())


  }

}
