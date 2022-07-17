//Q_01
package Demo{
  object Demo {
    def main(args:Array[String]): Unit ={

      val radius:Int=5;
      def area(r:Int):Double={
        (Math.PI)*r*r;
      }
      println("The area of disk when radius equal "+radius+" :"+area(radius));

    }
  }
}