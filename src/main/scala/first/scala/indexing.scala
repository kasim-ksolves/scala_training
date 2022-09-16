package first.scala

object indexing extends App{
  val arr = Array("kasim","asim","sheikh","sheikh")
  val list = List(1,2,3,4,5,6,7,8,9)
  val str = "kasim sheikh"
  println(arr(0))
  println(list.indexOf(5))

  println(str.indexOf("a"))
  println(str(4))

  println(arr(5))
  println(arr.indexOf("kasim"))
}
