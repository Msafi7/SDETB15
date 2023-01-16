package ReplitPractices;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner Scan=new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name=Scan.next();
        System.out.println("Please enter your last name:");
        String lastname=Scan.next();
        System.out.println("Please enter your age");
        int age=Scan.nextInt();
        System.out.println(" Thank you "+ name+ " " +lastname+ " you are "+ age+" Years old");


    }
}
