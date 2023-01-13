package Class5;
import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("please enter your name");
        String name=scan.next();
        System.out.println("Your name is "+name);

        System.out.println();

        System.out.println("Please enter your full name");
        String FullName=scan.next();
        System.out.println("Your full name is " +FullName);

        System.out.println("Please enter your age");
        int age=scan.nextInt();
        System.out.println("your age is "+age);

        System.out.println("what is your gender");
        char gender=scan.next().charAt(0);
        System.out.println("you are male");

        scan.close();


    }
}
