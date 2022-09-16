package first.scala

object slicing_dicing extends App{
val str = "abcdefghijklmnopqrstuvwxyz"
  println(str.slice(0,10))
val str1 = str.slice(0,11)
  println(str1)
  println(str(3))
  val r = str.replace('a','A')
  println(r)


}
