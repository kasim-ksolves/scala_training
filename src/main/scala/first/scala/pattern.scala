package first.scala

object pattern extends App {

  for (i <- 6 to 1 by -1) {
    for (j <- i to 6) {
      print(j)
    }
    println()
  }

}
