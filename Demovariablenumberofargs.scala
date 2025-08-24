package functional_programming

object Demovariablenumberofargs
{
  def print_item(n:Int,args:String*): Unit = {
    for(arg <- args)
    {
      println(arg * n)
    }

  }
  //put star parmater at the end always
  // you can't have more than 1 star

  def main(args: Array[String]): Unit = {

  }
}
