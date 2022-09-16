package first.scala
/*this will print a pattern given below:
6
56
456
3456
23456
123456*/
object pattern extends App {

  for (i <- 6 to 1 by -1) {
    for (j <- i to 6) {
      print(j)
    }
    println()
  }

}
