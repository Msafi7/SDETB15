package Class7;

import java.util.Scanner;

public class Whileloop {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);

        int i=1;

        while(i!=4){
            System.out.println("Please enter a number");
            i=scan.nextInt();
        }
    }
}
