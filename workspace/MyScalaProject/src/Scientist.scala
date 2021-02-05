class Scientists(name:String,deptName:String) {
  def getName=name
  def getDepartment=deptName

}

object Scientists{ // companion object
  private var map:Map[Int,String]=Map(1->"Java",2->"sql")
  def getDepartmentName(deptId:Int):String={
  // iterate from the map and do the condition
  "Java"
  }
}

object Myapp5 extends App{
  var dept:String= Scientists.getDepartmentName(1)
  var s:Scientists =new Scientists("Sajal",dept)
  println(s.getDepartment)
  println(s.getName)


}