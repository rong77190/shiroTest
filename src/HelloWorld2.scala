/**
  * Created by Administrator on 2016/11/1/001.
  */

object HelloWorld2 {
  /* This is my first java program.
  * This will print 'Hello World' as the output
  */
  def main(args: Array[String]){
//    println("Hello, world!") // prints Hello World
    println(looper(10,76))
  }
  def looper(x : Long, y : Long): Long ={
    var a = x
    var b = y
    while (a != 0){
      val temp = a
      a = b % a
      b = temp
    }
    return  b
  }
}