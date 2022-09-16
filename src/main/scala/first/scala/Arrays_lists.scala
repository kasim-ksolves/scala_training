package first.scala

object Arrays_lists extends App{
val arr = Array("kasim","asim","sheikh","sheikh")
  val list = List(1,2,3,4,5,6,7,8,9)
  println(arr(2))
  arr(2) = "Asim"
  println(arr(0))
  val k = arr.slice(0,2)
println(k)
  println(list)

}
