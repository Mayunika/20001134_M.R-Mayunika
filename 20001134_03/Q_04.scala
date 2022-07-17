//Q_04
package Demo{
  object Demo {
    def main(args:Array[String]): Unit ={

      val cover_price=24.95;
      val discount=40/100.0;

      def cover(no_copy:Int):Double={
        no_copy*cover_price;
      }
      def discount_price(no_copy:Int):Double={
        cover(no_copy)*discount;
      }
      def cover_cost(no_copy:Int):Double={
        cover(no_copy)-discount_price(no_copy);
      }
      def shipping_cost(no_copy:Int):Double={
        if(no_copy>=50){
          no_copy*50;
        }
        else{
          no_copy*3+(no_copy-50)*0.75;
        }
      }
      def cost(no_copy:Int):Double={
        cover_cost(no_copy)+shipping_cost(no_copy);
      }

      var no_copy=60;
      println("The cost for "+no_copy+" copies : Rs "+cost(no_copy));

    }
  }
}