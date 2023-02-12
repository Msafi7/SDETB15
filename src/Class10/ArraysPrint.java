package Class10;

public class ArrayP {
    public static void main(String[] args) {
        int[] arr={10, 11,12,15,19,22};

        //to print odd numbers only
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0){
                System.out.println(arr[i]);
            }

        }
        System.out.println("Even numbers beyond this point");
        //to print even numbers.
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }

        }
        System.out.println("Replace odd umbers to 0");
        //replace odd numbers with 0
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0){
                arr[i]=0;
                System.out.println(arr[i]);
            }

        }
    }
}
