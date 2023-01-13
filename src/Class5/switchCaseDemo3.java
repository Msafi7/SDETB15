package Class5;

import java.util.Scanner;

public class switchCaseDemo3 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter you gender m f");
        char gender=scan.next().charAt(0);

        switch (gender){
            case 'f':
                System.out.println("Female");
                break;
            case 'F':
                System.out.println("Female");
                break;
            case 'm':
                System.out.println("Male");
                break;
            case'M':
                    System.out.println("Male");
                    break;
            default:
                System.out.println("Not specified");
        }
    }
}
