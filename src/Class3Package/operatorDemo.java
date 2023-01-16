package Class3Package;

public class operatorDemo {
    public static void main(String[] args) {
        int number=10;
        System.out.println(number/3);
        //the reason why the result is 3 coz int doesn't support decimals.
        System.out.println(number%3);
        /* when should we use module, when we have a remainder and we want to find out what the remainder.
         the result shows 1 coz the module is showing the remaining part which was 1 on above variable.

         */
        System.out.println(16/5);
        System.out.println(16%5);
        /*if we want to find if the number is odd or even we can find with use of modulus operator.
        we alway take the 2 with modulus if the result is zero its even or the number is odd.
         */
        System.out.println(156%2);
        System.out.println(1555%2);
        //if we want to know if th number 1555 is de-visible by 5 it 0 it means it de-visibled by 5.
        System.out.println(1555%5);

    }
}
