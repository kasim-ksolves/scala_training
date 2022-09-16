package first.scala
import scala.util.control.Breaks._
import scala.collection.mutable

object Data_types_and_variables extends App{

  val a1 = true
  val a2 = 126
  val a3:Byte=126
  val a4 = 2.145698f
  val a5 = 2.93846523
  val a6:Short = 45
  val a7 = 'A'
  val s = "this is my first scala program"
  // Boolean
  println(a1.booleanValue())
  println(a1.compare(true))
  // Integer
  println(a2.isWhole)
  println(a2%2)
  println(a2)
  println(a2.floor)
  println(a2.floor.toInt)
  println(a2.max(4567))
  // String
  println(s.length)
  println(s.charAt(5))
  println(s.compareTo("this is my first scala program"))
  println(s.compareToIgnoreCase("hello"))
  val s2 = "kasim"
  println(s.concat(s2))
  println(s2.equals("kasim sheikh"))
}
