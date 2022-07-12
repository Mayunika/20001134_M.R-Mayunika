//Q03
package Demo
object Demo {
  def main(args:Array[String]): Unit ={

    //using If- else
    def findMax(n1:Int, n2:Int, n3:Int):Int={
        if(n1>n2){
          if(n1>n3){
            n1
          }
          else{
            n3
          }
        }
        else{
          if(n2>n3){
            n2
          }
          else{
            n3
          }
        }
      }

      var n1=10; var n2=12; var n3=5;
      println("The maximum value : "+findMax(n1,n2,n3));


    //scala does not have ternary operator like  (expression ? statement1 : statement2)
  }
}