package class12;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class StringDemo9 {
    public static void main(String[] args) {
        //Check the location of an index.

        String str="Java is love";
        System.out.println(str.indexOf('a'));

        for (int i = 0; i < str.length(); i++) {//to find the location of all charcter in a string.

            System.out.println(str.charAt(i)+" has the index "+i);


        }


    }
}
