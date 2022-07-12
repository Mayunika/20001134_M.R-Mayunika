//Q08
import scala.io.StdIn.readInt
import scala.io.StdIn.readFloat
package Demo {
  object Demo {
    def main(args: Array[String]): Unit = {

      println("You need to convert :");
      println("1.Celsius to Fahrenheit");
      println("2.Fahrenheit to Celsius");
      val i=readInt();
      println("Enter temperature :");
      val temp=readFloat();
      convert(i,temp);

      def convert(i:Int, temp:Float):Unit={
        if(i==1){
          println(cel_to_fahr(temp));
        }
        else if(i==2){
          println(fahr_to_cel(temp));
        }
        else{
          println("Invalid value");
        }
      }

      def cel_to_fahr(temp:Double):Double={
        (temp)*(9/5.0)+32;
      }
      def fahr_to_cel(temp:Double):Double={
        5/9.0*(temp-32);
      }


    }
  }
}