package Class10;

public class ForLeapDemo {
    public static void main(String[] args) {
        //replace all the odd numbers in this arrays to 0 .

        int[] arr = {10, 13, 20, 25, 45, 50};
        // System.out.println(arr[i]);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] %2!=0) {
                arr[i] =0;
            }
        }
        //
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

        }
    }