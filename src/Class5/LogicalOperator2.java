package Class5;

public class LogicalOperator2 {
    public static void main(String[] args) {
        /*
        if the score in all the subject are greater than 90 print brillian student otherwise print you need to study
        hard
         */

        double mathScore = 92.5;
        double historyScore = 92.5;
        double ScienceScore = 93.5;

        /*if(mathScore>90){
            if(historyScore>90){
                if(historyScore>90);
        }*/

        if (mathScore > 90 && historyScore > 90 && historyScore > 90) {
            System.out.println("You are a brilliant student");
        } else {
            System.out.println("you need to study hard");
        }

        String name = "Omar";
        int age = 4;

        if (name.equals("Omar") && age == 4) {
            System.out.println("you are Omar");
        } else {
            System.out.println("I don't know you");

        }
        //(! )make the true to false and V/S.

        boolean isTrue=false;
        boolean condition=!isTrue;
        if (condition){
            System.out.println("you got it");

        }else {
            System.out.println(" you need more practice");
        }

    }
}
