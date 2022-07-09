//Q01 & Q02

package Demo

object Demo {
  def main(args:Array[String]): Unit ={
    var i:Int=2;
    var j:Int=2;
    var k:Int=2;
    var m:Int=5;
    var n:Int=5;
    var f:Float=12.0f;
    var g:Float=4.0f;
    var c:Char= 'x';

    println("k+12*m = " + (k+12*m)); //260 #wrong
    println("m/j = "+ m/j);
    println("n%j = " + n%j);
    println("m/j*j = " + m/j*j);
    println("f+10*5+g = " + (f+10*5+g));  //12.0504.0 #wrong (12.0 + 50 + 4.0)
    println("++i*n = "+ (i+1)*n); //In Scala, the unary increment (++) and decrement (--) hence we use (i+1)
  }
}
