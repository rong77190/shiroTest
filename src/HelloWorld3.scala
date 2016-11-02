import java.io.File

/**
  * Created by Administrator on 2016/11/1/001.
  */

object HelloWorld3 {
  /* This is my first java program.
  * This will print 'Hello World' as the output
  */
  def main(args: Array[String]){
//    println("Hello, world!") // prints Hello World
//    println(looper(10,76))

    var file = if(! args.isEmpty) args(0) else "1.txt"
      println(file)


//    for (i <- 1 to 10){
    for (i <- 1.to(10)){
      println(i)
    }
    var files = (new File(".")).listFiles()
    for (file <- files){
      println(file)
    }
  }
}