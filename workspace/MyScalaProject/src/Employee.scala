

class Employee {
  
    var name:String="Ashish"; // instance variable
  
    def getName():String={
       name
    }
  
}


class Employee1(private var fname:String,lname:String){
 
      //var fname:String=""; // instance variable
    private var address:String=null
   
    def this(fname:String,lname:String,address:String){ // Auxillary constructor
      this(fname,lname) // calling the primary constructor
      this.address=address
    }
  
      def getfName():String={
         fname
      }
      def getlName():String={
        lname
      }
      def getAddress:String={
        address
      }
  
}

class Person2(fname:String,lname:String) {
  def getFName=fname
  def getLName=lname
}
class TemporaryEmployee2(fname:String,lname:String) extends Person2(fname,lname)
class PermanentEmployee2(fname:String,lname:String) extends Person2(fname,lname)



class Person3(private val fname:String,private val lname:String) {
  private var address:String=null
  def getFName=fname
  def getLName=lname
  def getAddress=address
  def this(fname:String,lname:String,address:String){
  this(fname,lname)
  this.address=address
  }
}

class TemporaryEmployee3(private val fname:String,private val lname:String,private val address:String)
extends Person3(fname,lname,address){ // calling the auxillary constructor of parent

//overriden any method method name argument and return type should be same
// differ in access specifiers

 override def getFName="Name is:"+fname
}
class PermanentEmployee3(fname:String,lname:String) extends Person3(fname,lname)


abstract class Person{}






object Execute extends App{
   
  /*
  var e= new Employee() // object of an employee 
  
  e.name="Sajal" // visible
  println(e.getName)
   
  var emp:Employee1=new Employee1("Sajal","Sinha");

  println(emp.getfName())
  println(emp.getlName())

  var e1:Employee1=new Employee1("Sajal","Sinha","Pune")
  println(e1.getfName)
  println(e1.getlName)
  println(e1.getAddress)
  */
  
  /*
  var t = new TemporaryEmployee();
  println(t.getName())
  
  var p = new PermanentEmployee()
  println(p.getName())
  
  */
  
  var t=new TemporaryEmployee2("Sajal","Sinha");// Type reference
  println(t.getFName+".."+t.getLName)
  var p:PermanentEmployee2=new PermanentEmployee2("John","Hawkins");// Type reference
  var f=p.getFName
  var l=p.getLName
  println(s"First Name:$f, Last Name $l")
  
  
  
  var t3=new TemporaryEmployee3("Sajal","Sinha","Pune");// Type reference
  println(t3.getFName+".."+t3.getLName+".."+t3.getAddress)
  var p3:PermanentEmployee3=new PermanentEmployee3("John","Hawkins");// Type reference
  var f3=p3.getFName
  var l3=p3.getLName
  var d3=p3.getAddress
  println(s"First Name:$f3, Last Name $l3, $d3")
  
  
  
  
  
  
}