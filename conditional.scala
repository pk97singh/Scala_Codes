package functional_programming

object conditional {
  def show(): Unit = {
    val my_lst=List(1,2,3,4,5,6)
    for (i<-my_lst){
      println(i)
    }
  }

  def even(x:Int): Unit = {
    for (i <- x until 10 if i%2==0){
      println()
    }

  }

  def main(args: Array[String]): Unit = {
     show()

  }

}
