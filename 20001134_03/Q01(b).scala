//Q01
package Demo
object Demo {
  def main(args:Array[String]): Unit ={
    var var1= -2;
    var var2= 3;
    var absVal = (a:Int) => {if(a<0) -a else a}
    println("The absolute value of "+var1+ " is : "+absVal(var1));
    println("The absolute value of "+var2+ " is : "+absVal(var2));
  }
}