package Class5;

public class LogicalOperators1 {
    public static void main(String[] args) {

      /*logical or(||) operator. if one condition is true and the second condition is false
      the result will be true or on another words if one condition is true out of multiple conditions.
      if all conditions false then the result is false.

       */

        boolean boughtChocolate=false;
        boolean boughtFlower=false;

        if(boughtChocolate||boughtFlower){
            System.out.println("I am happy");

        }else{
            System.out.println("I am sad");
        }

        boolean fiveG=false;
        boolean wifi=false;
        if(fiveG||wifi){
            System.out.println("you are good to browse the internet");
        }else{
            System.out.println("Either connect to fiveG or Wifi");
        }

    }


}
