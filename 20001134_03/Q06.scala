//Q06
import scala.io.StdIn.readInt
package Demo{
  object Demo {
    def main(args:Array[String]): Unit ={

      //Q06 (a)
      def grade1(mark:Int):Unit ={
        if(mark>69){
          println("Very Good");
        }
        if(mark<=69 && mark>54){
          println("Good")
        }
        if(mark<=54 && mark>39){
          println("Pass")
        }
        if(mark<=39 && mark>=0){
          println("Fail")
        }
        if(mark<0) {
          println("Invalid mark")
        }
      }

      //Q06 (b)

      def grade2(mark:Int):Unit={
        if(mark<0){
          println("Invalid mark");
        }
        else{
          if(mark>69){
            println("Very Good");
          }
          else if(mark>54){
            println("Good");
          }
          else if(mark>39){
            println("Pass");
          }
          else{
            println("Fail");
          }
        }
      }

      //Qo6 (c) scala not support ternary if-else statement

      println("Enter your mark :");
      val mark=readInt();
      grade2(mark);

    }
  }
}