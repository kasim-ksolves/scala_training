package first.scala

object list_methods extends App{
//  /  //addstring method
val list = List(1,2,3,4,5,6)
val res = list.addString(new StringBuilder(),"--")
println(res)

//  //  //Dropright method remover last n elements
val m = List(1,2,3,4,5,6,7,8,9)
 val mres = m.dropRight(3)
println(mres)

//  //  //drop method removes first n elements
 val m1res = m.drop(3)
 println(m1res)

//  //  //take method will select first n elements
 val tres = m.take(5)
println(tres)

//  //  //takeright method will select last n elements
 val rres = m.takeRight(3)
 println(rres)

}
