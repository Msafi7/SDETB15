package Class10;

import java.util.Arrays;
import java.util.Scanner;

public class D2Arrays {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter 5 number");
        int [] numbers=new int[5];

        /*numbers[0]=2;
        numbers[1]=3;
        numbers[2]=4;
        numbers[3]=28;
        numbers[4]=33;*/
     /*   System.out.println(Arrays.toString(numbers));*/
        //Below code take the number from user and store them in the array its good but a lot of codes
        /*numbers[0]=scanner.nextInt();
        numbers[1]=scanner.nextInt();
        numbers[2]=scanner.nextInt();
        numbers[3]=scanner.nextInt();
        numbers[4]=scanner.nextInt();*/

        //below code uses a normal for loop to ask the user for numbers and store them in the array.
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=scanner.nextInt();

        }
        System.out.println(Arrays.toString(numbers));



    }
}