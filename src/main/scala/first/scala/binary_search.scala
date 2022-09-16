package first.scala

object binary_search extends App{
    import scala.util.control.Breaks._
    val arr = Array(2,3,4,10,40)
    var l = 0
    var h = (arr.length)-1
    val x = 10
    breakable {
      while (h >= l) {
        val mid = l + ((h - l)) / 2
        if (arr(mid) == (x)) {
          println(mid)
          break()

        }
        else if (arr(mid) > x) {
          h = mid - 1
        }
        else {
          l = mid + 1
        }
      }
    }

   for(i <- 6 to 1 by -1){
    for(j <- i to 6 ){
     print(j)
    }
    println()
   }

}
