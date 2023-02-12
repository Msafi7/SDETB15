package Class15;

public class MPractice {
    /*
    Create a method that takes an array of int sum all the elements from the array and return the sum.
    while creating a method below steps shall be followed.
    1.return type=>int
    2.Name of Method=> arraySum
    3.Parameters=in [] arr
    4. the Method body
     */

    int arraySum(int[]arr){
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
        return sum;
    }

}
