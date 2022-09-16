package first.scala

object random_char extends App{
  val r = scala.util.Random
    var p = ""
    var q = ""
    for (i <- 1 to 10) {
      val x = (math.random * (91-65) + 65).toInt //gives a range between 65 to 90
      val y = r.nextPrintableChar() // will give all characters including characters
      p = p+(x).toChar
      q = q+y
    }
  println(p)
    println(q)

}
