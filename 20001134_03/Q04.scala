//Q04
package Demo
object Demo {
  def main(args:Array[String]): Unit ={

    //using If- else
    val oddEven =(x:Int) => if(x%2==1) "odd number" else "even number"
    var num1=2;
    var num2=5;
    println("The number "+num1+" is " +oddEven(num1));
    println("The number "+num2+" is " +oddEven(num2));
  }
}