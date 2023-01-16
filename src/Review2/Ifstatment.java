
package Review2;

import com.sun.tools.javac.Main;

public class Ifstatment {
    public static void main(String[] args) {
        /*
        ifstatment -is a conditional Statement. condition should be either true or faLse.
        if follow boolean condition. if (boolean condition){block of code}
        Notes: 1. if followed with primitive data types, we use relational operators (>, >= <, <= =, !=, ==
                2. if followed with string type data then variable follows the writing equal i.e
                3. if only followed by boolean data type not require only condition we right in ( ).
         */


        int day = 2;
        String month = "December";
        boolean evening = true;
        if (day==2) {
            System.out.println("it's beginning of the month");
        }if (evening) {
            System.out.println("I will go for picnic");
        }
    }
}



