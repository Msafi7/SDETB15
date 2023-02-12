package Class8;

public class nestedLoopDemo1 {
    public static void main(String[] args) {
       /*
         1 2 3 4 5
         1 2 3 4 5
         1 2 3 4 5

        */

        for (int i = 1; i <4; i++) {//Execute the below 3 times.
            for (int j = 1; j <=5 ; j++) {
                System.out.print(j+" ");// prints the value of i from 1 to 5

            }
            System.out.println();

        }
    }
}
