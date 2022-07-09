// Q04

package Demo

object Demo {
  def main(args:Array[String]): Unit ={

    // Q04 (a)
    var normal:Int=40; //for test data
    var OT:Int=30;  //for test data

     def normal_salary(normal:Int):Int={
       normal*250;
     }
    def OT_salary(OT:Int):Int={
      OT*85;
    }
    def salary(normal:Int, OT:Int):Int={
      normal_salary(normal)+OT_salary(OT);
    }
    def tax(normal:Int, OT:Int):Double={
      salary(normal,OT)*12/100.0;
    }
    def takehome_salary(normal:Int, OT:Int):Double={
      salary(normal,OT)-tax(normal,OT);
    }
    println("Take home salary :"+takehome_salary(normal,OT));

    // Q04 (a)

    var performance=500;
    var att_cost=3;

    def no_of_attendent(new_price:Int):Int={
      120+(new_price-15)*4;
    }
    def attened_cost(new_price:Int):Int={
      no_of_attendent(new_price)*att_cost;
    }
    def revenue(new_price:Int):Int={
      (no_of_attendent(new_price)*new_price);
    }
    def profit(new_price:Int):Int={
      revenue(new_price)-(attened_cost(new_price))-performance;
    }
    printf("Profit : %d Rupees",profit(15));

  }
}
