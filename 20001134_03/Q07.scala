//Q07
import scala.io.StdIn.readInt
package Demo{
object Demo {
  def main(args:Array[String]): Unit ={

    def season(month:Int):Unit= {
      month match {
        case 12 | 1 | 2 => println("Winter")
        case 3 | 4 | 5 => println("Sprint");
        case 6 | 7 | 8 => println("Summer");
        case 9 | 10 | 11 => println("Autumn");
        case _ => println("Bogus month");
      }
    }

    println("Enter month number :");
    val month=readInt();
    season(month);
  }
}
}