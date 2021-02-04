
scala 
OOPS + Functional Programming

scala based on JDK
scala today -> big data

Download->
http://scala-ide.org/
http://scala-ide.org/download/sdk.html

You might need to Download JDK 1.8

REPL for scala -> command line tool -> interpreted

Download ->
https://www.scala-lang.org/download/


Environment variables
I have JDK 15 and JDK 8
put jdk 1.8/bin path at top
then scala/bin put next



first program

create a file with .scala extension
compile
scalac filepath
two .class files get generated with classname


INPUT Hello World

object FirstScala {
    def main(s:Array[String]):Unit={
    println("hello world")
}



OUTPUT on terminal

PS F:\scala-training\scala\Day_1> scalac .\hello_world.scala
PS F:\scala-training\scala\Day_1> scala FirstScala
hello world
PS F:\scala-training\scala\Day_1> 



But all implicit types -> everything is Object
NO explicit types


VAR -> mutating 
VAL -> immutable


Static Typing
Static typed programming languages are those in which variables need not be defined before they’re used.



object Day1Object {

  def main(arr:Array[String]){
    println("Hello World"+"..."+display)
  }
  
  def display="welcome"
}



