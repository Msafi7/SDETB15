package Class10;

public class Array {
    public static void main(String[] args) {

        int[] arr={10,20,30, 40, 50,};
        System.out.println(arr [4]);
        System.out.println(arr[1]+" "+arr[4]);
        // print all above vlaues with the help of for.
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        System.out.println("****************************");

        //enhanced for loop.

        for(int number: arr){
            System.out.println(number);
        }


    }
}
