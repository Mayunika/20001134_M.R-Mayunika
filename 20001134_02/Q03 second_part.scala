// Q03 second_part

package Demo

object Demo {
  def main(args:Array[String]): Unit ={
    //Q03 second_part
    var a:Int=2;
    var b:Int=3;
    var c:Int=4;
    var d:Int=5;
    var k:Float=4.3f;

    println("--b * a + c *d-- = (b-1)*a+c*(d-1) = " + ((b-1)*a+c*(d-1)));
    println("a++ = "+ a);a=a+1;
    //println("-2 * (g-k) + c" + (-2*(g-k)+c)); // Error since variable g is not defined
    println("c=c++ = " + c);c=c+1;
    println("c=++c*a++ = "+ ((c+1)*a) );

  }
}
