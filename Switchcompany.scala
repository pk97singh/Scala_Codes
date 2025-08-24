package Practice

trait Switchcompany {

  def new_Company:String //Abstract method
  def print_new_organisation(): Unit = { //concrete method
       print("switched company to", {new_Company})
  }

}
