//Q09
import scala.io.StdIn.readLine
package Demo {
  object Demo {
    def main(args: Array[String]): Unit = {

      def cal(ex:Array[String]): String = {
        var n=0;var m=0;
        val operator = new Array[String](5);
        val operand = new Array[String](5);
        for (i <- ex) {
          if (i == "+" || i == "-" || i == "*" || i == "/") {
            operator(n) = i;
            n = n + 1;
          }
          else {
            operand(m) = i;
            if (n != 0) {
              if (operator(n - 1) == "+") {
                operand(0) = (operand(m - 1).toInt + operand(m).toInt).toString;
              }
              else if (operator(n - 1) == "-") {
                operand(0) = (operand(m - 1).toInt - operand(m).toInt).toString;
              }
              else if (operator(n - 1) == "*") {
                operand(0) = (operand(m - 1).toInt * operand(m).toInt).toString;
              }
              else {
                operand(0) = (operand(m - 1).toInt / operand(m).toInt * 1.0).toString;
              }
              m = 1;
              n = 0;
            }
            else {
              m = m + 1;
            }
          }
        }
        operand(0);
      }


      println("Enter expression separated by spaces :");
      val ex=readLine().split(" ");
      println("Result :"+cal(ex));

    }
  }
}