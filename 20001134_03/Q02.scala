//Q02
package Demo
object Demo {
  def main(args:Array[String]): Unit ={

    //using If- else
    def findMax(n1:Int, n2:Int):Int={
        if(n1>n2){
          n1
        }
        else{
          n2
        }
      }

      var n1=10; var n2=12;
      println("The maximum value : "+findMax(n1,n2));
    

    //scala does not have ternary operator like  (expression ? statement1 : statement2)
  }
}