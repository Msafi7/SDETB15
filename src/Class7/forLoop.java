package Class7;

public class forLoop {
    public static void main(String[] args) {
        //Using a for Loop print odd numbers from 1 to 20.
        for (int i = 1; i <= 20; i += 2) {
            System.out.println(i);
        }
        // For loop with help of "If". give us the same result.

        for (int j = 1; j <= 20; j++) {
            if (j % 2 != 0) {
                System.out.println(j);
            }

        }
    }
}
