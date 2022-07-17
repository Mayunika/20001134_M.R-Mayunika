//Q_05
package Demo{
  object Demo {
    def main(args:Array[String]): Unit ={

      def easy(duration:Double):Double={
        duration*8;
      }
      def tempo(duration:Double):Double={
        duration*7;
      }

      val easy_D1=2;
      val tempo_D=3;
      val easy_D2=2;

      println("The running time :"+(easy(easy_D1)+tempo(tempo_D)+easy(easy_D2))+" min");

    }
  }
}