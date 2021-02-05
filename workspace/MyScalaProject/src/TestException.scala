import java.io.{File, FileOutputStream, InputStream, IOException}


class TestException {

 def m() {
  try {
      var x:String="ABC"
      println(x.length()) // Object is created
    } catch {
      case ex: ArithmeticException => {
      println("do not divide by zero")
    }
      case ex: NullPointerException => {
      println("do not work with null")
    }
    }finally{
      println("finally work")
    }
  }

}

object myApp6 extends App {
  var x: TestException = new TestException()
  x.m

}


class TestException1 {

  def m() {
    try {
      throw new IOException // explicitly to generate exception
    } catch {
      case ex: ArithmeticException => {
      println("do not divide by zero")
    }
      case ex: NullPointerException => {
      println("do not work with null")
    }
      case ex: IOException => {
      println("IO is handled")
    }
    }finally{
      println("finally work")
    }
  }

}

object myApp7 extends App {
  var x: TestException = new TestException()
  x.m

}



class UserNotFoundException(errorMsg:String) extends Exception(errorMsg)

class TestException3 {

  def check(username:String) {
    try {
      if(username.equals("admin")){
        throw new UserNotFoundException("Wrong user");
      }
      else
        println(username)
      } catch {
        case ex: ArithmeticException => {
        println("do not divide by zero")
      }
        case ex: NullPointerException => {
        println("do not work with null")
      }
        case ex: UserNotFoundException => {
        println(ex.getMessage)
      }
    }finally{
      println("finally work")
    }
  }

}

object myApp9 extends App {
  var x: TestException3 = new TestException3()
  x.check("sajal")

}
