package first.scala

object subgroup extends App{
  val str = "Hello my name is kasim"
  val n = scala.io.StdIn.readInt()
  for (i <- 0 to str.length by n) {
    print(str(i))
  }
}
