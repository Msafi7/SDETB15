package review4;

import javax.print.attribute.DateTimeSyntax;
import javax.swing.*;

public class SwitchReview {
    public static void main(String[] args) {

        //Syntax
        int worldCup=2022;

        switch (worldCup){
            case 2022:
                System.out.println("Winner is Argentina");
                break;
            case 2018:
                System.out.println("Winner is France");
                break;
            case 2014:
                System.out.println("Winner is Germany");
                break;
            default:
                System.out.println("Winner is Unkown");

        }
    }
}
