/**
  * Created by Administrator on 2016/11/1/001.
  */

object HelloWorld1 {
  /* This is my first java program.
  * This will print 'Hello World' as the output
  */
  def main(args: Array[String]){
//    println("Hello, world!") // prints Hello World
    doWhile()
  }

  def doWhile(){
    var line = ""
            do {
              line = readLine()
                println("read:"+line)
            }while(line != null)
  }
}