package Class15;

public class MPractice4 {
    /*
    Create a method that takes two numbers as parameters and return the larger number.

    return type=>int
    2.Name of Method=> LargerNumber
    3.Parameter=> int num1, int num2
    4. the Method body
    {
    if
    }
     */
    int largerNumber(int numb1, int numb2){
        if(numb1>numb2){
            return numb1;
        }else{
            return numb2;
        }
    }

    public static void main(String[] args) {
        MPractice4 mp=new MPractice4();
        System.out.println(mp.largerNumber(12, 16));
    }

}

