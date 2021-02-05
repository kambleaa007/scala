// a class can extends multiple trait
// a trait can extends multiple trait
trait TNewDoctor1{
  def dob:String
}
trait TNewDoctor{
  def doj:String
}
trait TDoctor extends TNewDoctor with TNewDoctor1 {
  def treatPatient:String
  def work="Apollo"
  var name:String
  var address:String="Chennai"
  val contact:Double
  val email:String="apollo@gail.com"
}

class GeneralPhysian(fname:String,con:Double) extends TDoctor{
  //with TNewDoctor{
  var name:String=fname
  val contact:Double=con
  def treatPatient="Normal treatment"+name+contact
  def doj:String="12-12-2021"
  override def work="ABC"
  def dob:String="12-6-1983"
}
object myApp3 extends App{
  var d:TDoctor =new GeneralPhysian("Sajal",28302)
  print(d.treatPatient)
  print(d.email)
  print(d.work)
  print(d.doj)
  print(d.dob)
}