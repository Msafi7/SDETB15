package Class6;

public class homeWork {
    public static void main(String[] args) {
        //print numbers fom 1 to 100 in one line.

        int number=1;
        while(number<=100){
            System.out.println(number);
            number++;

        }
        System.out.println("*******************************");

        //print the numbers from 100 to 1.

        int number2=100;
        while(number2>=1){
            System.out.println(number2);
            number2--;
        }

        System.out.println("--------------------------");

        //print even numbers from 20 to 1.

        int number3=20;
        while(number3>=1){
            System.out.println(number3);
            number3-=2;

        }
        System.out.println("0000000000000000000000000000000");

        //print odd numbers from 20 to 1.

        int number4=20;
        while(number4>=1){
            if(number4%2!=0)
            System.out.println(number4);
            number4--;
        }
        System.out.println("+++++++++++++++++++++++++++");

        //print odd number between 20 and 50.

        int number5=20;
        while(number5<=50){
            if(number5%2!=0)
            System.out.println(number5);
            number5+=1;
        }

    }
}
