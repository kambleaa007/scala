

class Employee {
  
    var name:String=""; // instance variable
  
    def getName():String={
       name
    }
  
}

object Execute extends App{
   var e=new Employee() // object of an employee 
   e.name="Sajal" // visible
   println(e.getName)
}