package Class3Package;

public class TypeCasting {
    public static void main(String[] args) {
        /*the java does not accept to change to another box. to enforce java we add (byte ) after equal and wir
          byte

         */
        long number=125;

        byte shorterNumber=(byte) number;
        System.out.println(shorterNumber);
        /*if we want to add decimal number to integer and if we force java to move it, java will remove the decimal
        part and add the rest
         */
        float f=10.5f;
        int Num=(int) f;
        System.out.println(Num);
        /*
        byte
        short
        int
        long
        float
         */

        //if we try to move to content of a smaller box to larger Java won't show any error.
        byte b=10;
        short number2=b;
        System.out.println(number2);

    }
}