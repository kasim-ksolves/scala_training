package first.scala

object factorial extends App{
    def factorial(n:Int):Int = {
    if(n==0){
      return 1
    }
      else{
      return n*(factorial(n-1))
    }
    }

   val x = factorial(5)
   println(x)
}
