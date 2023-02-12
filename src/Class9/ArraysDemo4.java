package Class9;

public class ArraysDemo3 {
    public static void main(String[] args) {

        //write a code to add the numbers from the array
        //we need a vairable before adding the number
        int sum=0;

        int [] numbers={10,20,30,45,50};
        for (int i = 0; i < numbers.length; i++) {
            sum=sum+numbers[i];
        }
        System.out.println(sum);



        }



    }
