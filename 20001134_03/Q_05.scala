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

      val easy_D=2;
      val tempo_D=3;

      println("The running time :"+(easy(easy_D)+tempo(tempo_D))+" min");

    }
  }
}