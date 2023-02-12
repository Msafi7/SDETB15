package Review5;

public class Array2DReview {
    public static void main(String[] args) {
        //2D arrays
        //Syntax
        int[][] array={
                {1,2,3,7,9},
                {10,20,30,40},
                {50,60,70,80}
        };


        //getting all values:using enhance for loop.
        for(int[]arr:array){//outer forloop iterates over the arrays.
            for(int num:arr){//inner for loop iterates over the elements.
                System.out.print(num+" ");
            }
            System.out.println();// The reason we put sout each array prints in seperate line not all in one.
        }
        //how do I find the number of arrays in the 2D arrays.
        int numberOfArrays=array.length;
        System.out.println(numberOfArrays);
        //How do I find the number of element in each array?
        int numberOfElementIn1Array=array[2].length;
        System.out.println(numberOfElementIn1Array);
        //To access an element in an array.
        System.out.println(array[1][1]);



    }
}
