import scala.util.control.Breaks._
import scala.collection.mutable.ListBuffer
import scala.collection.mutable.Set // mutable
// SET - no duplicate elements, immutable and mutable
import scala.collection.mutable.TreeSet
// mutable and ordered in maintain
import scala.collection.mutable.Map;
//Map - mutable and immutable map
//<key,value> --- key cannot be duplicate if it is duplicate
//then the value is updated
import scala.collection.mutable.TreeMap

object MyScalaApp extends App {
  

  def try1{
    println("hello world")
    fun(100)
    fun(100.2f)
    fun(100.90)
    fun(true)
    fun('A')
    /* def fun(x:AnyVal){
    println(x)
    }*/
    def fun(x:Any){
    println(x)
    }
  }
  
  def try2{
    var loop = 1 to 10
    var loop1 = 1 until 10 // 10 is excluded
    
    println(loop.getClass) // loop is Range class scala.collection.immutable.Range$Inclusive
    println(loop1.getClass)
    
    for(i <- loop){ // i is Range
      println(i)
      
    }
    
    for(y <-0 to 3; z<- 0 to 3){
      print(" y: "+y)
      println(" z: "+z)
    }
  }
  
  def try3{
    var name:String ="SAJAL"
    var lastname:String="sinha"
    println(s"My name is $name , the last name is $lastname")
    var s3=s"My name is $name , the last name is $lastname"
    println(s3)
    println(s3.length())
    println(s3.charAt(9))
    println(name.equals("sajal"))
    println(name.toLowerCase())
  }
  
  
  def try4{
    var name:String ="SAJAL"
    var lastname:String="sinha"
    println(s"My name is $name , the last name is $lastname")
    var s3=s"My name is $name , the last name is $lastname"
    println(s3)
    println(s3.length())
    println(s3.charAt(9))
    println(name.equals("sajal"))
    println(name.toLowerCase())
    println(name=="SAJAL")
    var s:String="sajal"
    var s1:String=new String("sajal")
    println(s.hashCode())
    println(s1.hashCode())
    println(s.equals(s1))
    println(s==s1)
  }
  
  def try5{
    var num=new Array[Int](5) // Array
    num(0)=100
    num(1)=200
    num(2)=300
    num(3)=400
    num(4)=500
    var sum:Int=0
    for(x <- num){
    sum=sum+x
    }
    println(sum)
  }
  
  def try6{
    var num=new Array[Int](5) // Array
    num(0)=100
    num(1)=200
    num(2)=325
    num(3)=400
    num(4)=500
    var sum:Int=0
    for(x <- num if (x%2)==0 && (x%2)==1){ // loop with condition
    /*if(x%2==0){
    sum=sum+x
    }*/
    sum=sum+x
    }
    println(sum)
  }
  
  def try7{
    val rows=2
    val cols=2
    var name=Array.ofDim[String](rows,cols) // 2 D Array
    name(0)(0)="sajal"
    name(0)(1)="XYZ"
    name(1)(0)="ABC"
    name(1)(1)="PQR"
    for(x <- 0 until rows ; y<- 0 until cols){
    println(name(x)(y))
    }
  }
  
  def try8{
    var x:Array[Int]=Array.emptyIntArray; // Empty array
    //println(x.hashCode())
    val x1=x:+26 // Appending 1 item in the array
    //println(x1.hashCode())
    //println(x1.length)//1
    val x2=x1 ++ Array(1,2,89,56,45)
    // for(x<-x2){
    // println(x)
    //}
    // prepending
    val x3=450 +: x2
    for(x<-x3){
    println(x)
    }
  }
  
  def try9{
    var x=List(1,2,3,4,5,"sajal",12.3f) // List is immutable collection
    for(x1<-x)
    println(x1)
    var name:List[String]=List("Sajal","ABC","XYZ")
    for(n<-name){
    println(n)
    }
  }
  
  
  def try10{
      var name:List[String]=List("Sajal","ABC","XYZ")
      println(name.length)
      println(name.tail) // returning a list
      println(name.head)
      println(name.isEmpty)
      println(name.reverse)
      println(name.contains("ABC"))
      //println(name(-1))
      var p=name.tail
      for(p1<-p){
      println(p1)
      }
  }
  
  def try11{
    
    var x=List()
    var x1=x.+:(28) // creating a new list
    println(x1.length)
    var x2=List(1,2,3)
    var x3=List(11,21,31)
    var x4=x2.++(x3) // concat of two list and creating a new list
    for(x<-x4){
    println(x)
    }
  }
  
  def try12{
    var x=List(100,80,67,56,43)
    println(x.sum)
    println(x.min)
    println(x.max)
    println(x.product)
    
  }

  def try13{
    var name=("Sajal","Amit",1) // tuple , immutable data structure,
    println(name._1)
    println(name._2)
    println(name._3)
    
  }
  
  def try14{
    def m()={
      (12,13,14)
    }
    var y1=m()
    println(y1._1)
    println(y1._2)
    println(y1._3)
        
  }
  
  def try15SwitchCaseMatchingExpression{
    
    def menu(i:Int):Unit={
      i match{
      case 1 => println("one")
      case 2 => println("two")
      case default => println("default")
      }
    }
    // Case is returning value
    def menu1(i:Int):String={
      var x=
      i match{
      case 1 => "one"
      case 2 => "two"
      case default => "default"
      }
      x;
    }
    println(menu1(4))
    menu(1)
  }
  
  def try16{
    var (a,b,c)=(1,2,3)
    println(a)
    println(b)
    println(c)
  }
  
  def try17{
    
    val numList = Array(1,2,3,4,5,6,7,8,9,10);
    breakable {
    for( a <- numList){
    println( "Value of a: " + a );
    if( a == 4 ){
    //loop.break
    break;
    }
    }
    }
    println( "After the loop" );
    
  }
  
  def try18{
    
    def display(a:Int) = a match{
    case 10 => println("i am 10")
    case 11 => println("I am 11")
    case _ => println( "I am default")
    }
    var x="WXYZ"
    x match{
    case "ABC" | "ABCD" |"WXYZ" => {
    println ("hello")
    }
    case "XYZ" => println("done")
    case _ => println("default")
    }
    display(10)
    
  } 
  //try18
  
  def try19{
    
    var x=new ListBuffer[String]()
    x+="sajal"
    x.+=("John")
    x+="Harry"
    x+=("mike","neha")
    x.append("XYZ","ABC")
    
    //println(x(2))
    // println(x.length)
    
    x-="John" // Removing john
    x-=("mike","XYZ") // Removing multiple
    //x.remove(1,3) // 
    
    for(name <- x){
    println(name)
    }
    
  }
  //try19
  
  def try20SetNoImportMutableSet{ // if import mutable.Set -> mutable if not by default Set is Imutable
    
    var x:Set[String]=Set("ABC","Sajal","Sajal","XYZ")
    // ERR x.add("Noah")
    x+="Kian"
    x.+=("X","Y","X") // multi values
    // ERR x.remove("Kian")
    x-="ABC"
    for(name <- x){
    println(name)
    }
    println(x.size)
    println(x.isEmpty)
    println(x.contains("Sajal"))
    
  }
  
  def try21ImportMutableSet{
    
    var x:Set[String]=Set("ABC","Sajal","Sajal","XYZ")
    x.add("Noah")
    x+="Kian"
    x.+=("X","Y","X") // multi values
    x.remove("Kian")
    x-="ABC"
    for(name <- x){
    println(name)
    }
    println(x.size)
    println(x.isEmpty)
    println(x.contains("Sajal"))
    
  }
  //try21ImportMutableSet
  
  def try22{
    
    var x:TreeSet[String]=TreeSet("ABC","Sajal","Noah","XYZ")

    for(name <- x){
    println(name)
    }
    
  }
  
  def try23{
    
    var x:Map[Int,String]=Map(1->"Sajal",2->"John") // mutable map
    x.put(3,"Amit");
    x+=(2->"Rakesh")// update old value same key
    for(key <- x.keySet){
    var value=x.get(key);
    value match{
    case Some(data) => println(data)
    case None => println("value not found")
    }
    }
    var v=x.get(10);
    v match{
    case Some(data) => println(data)
    case None => println("value not found")
    }
    
  }
  //try23

  def try24{
    
    var x:Map[Int,String]=Map(1->"Sajal",2->"John") // mutable map
    x.put(3,"Amit");
    x+=(2->"Rakesh")
    
    //x+=(2->"Rakesh",5 -> "Neha") // add multi elements
    //x-=(3) // Removing the element
    //x-=(3,1) // Removing the multi element
    
    for(key <- x.keySet){
    var value=x.getOrElse(key,"name not found");
    println(value)
    }
    var v=x.getOrElse(10,"name not found");
    println(v)
        
  }
  //try24
  
  def try25{
    
    var x:Map[Int,String]=Map(1->"Sajal",2->"John") // mutable map
    x.put(3,"Amit");
    x+=(2->"Rakesh",5 -> "Neha")
    x(5)="Mary" // update based on key
    for((key,value)<- x){ // iterate and get a tuple
      println(key+".."+value)
    }
    
  }
  //try25
  
  def try26{
    
    var x:TreeMap[Int,String]=TreeMap(1->"Sajal",2->"John") // mutable map
    x.put(5,"Amit");
    x.put(3,"Amir");
    
    //x+=(2->"Rakesh",5 -> "Neha")
    //x(5)="Mary" // update based on key
    for((key,value)<- x){ // iterate and get a tuple
      println(key+".."+value)
    }
    
  }
  try26
  
  def try27{}
  
  def try28{}
  
  def try29{}
  
  def try30{}
  
  def try31{}
  
  def try32{}
  
}

