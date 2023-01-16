package Class7;

public class WhileLoopPractice {
    public static void main(String[] args) {
        //10 8 6 4 2 print the number in line with while loop.

        int number=10;
        while(number>=2){
            System.out.print(number+" ");//when we want to add space in between also removing line in print.
            number-=2;

        }

        System.out.println("________________________________");


        int i=0;
        while(i<5){
            System.out.println(i);
            i++;
        }
        System.out.println("Next example");

        int number1=5;
        while(number1<10){
            System.out.println(number1);
            number1++;
        }
    }
}
