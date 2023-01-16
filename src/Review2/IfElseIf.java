package Review2;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public interface IfElseIf {
    public static void main(String[] args) {
        int Homework=30;
        if(Homework>=25){
            System.out.println("Great Job Keep it up");
        } else if (Homework>=20) {
            System.out.println("Good Job");

        } else if (Homework>10) {
            System.out.println("Not a good job");

        }
        String Browser="Opera";
        if (Browser.equals("Safari")){
            System.out.println("Test Executed on Safari");
        } else if (Browser.equals("Firefox")){
            System.out.println("Test case Executed on Firefox");

        } else if (Browser.equals("Chrome")) {
            System.out.println("Test Executed on Chrome");

        }else{//when none of the conditions are true, java will come the else part.
            System.out.println("browser is not supported");
        }

    }
}
