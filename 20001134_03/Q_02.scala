//Q_02
package Demo{
  object Demo {
    def main(args:Array[String]): Unit ={

      val temp=35;
      def to_fahrenheit(temp:Double):Double={
        temp*1.8+32;
      }
      println("The temperature value for "+temp+" C :"+to_fahrenheit(temp)+" F");

    }
  }
}