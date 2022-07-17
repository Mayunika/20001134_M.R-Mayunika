//Q_03
package Demo{
  object Demo {
    def main(args:Array[String]): Unit ={

      val radius=5;
      def cubicR(radius:Double):Double={
        radius*radius*radius;
      }
      def vol_sphere(radius:Double):Double={
        3.0/4*Math.PI*cubicR(radius);
      }
      println("The area of the sphere when radius equal to "+radius+" :"+vol_sphere(radius));

    }
  }
}