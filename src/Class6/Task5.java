package Class6;

public class Task5 {
    public static void main(String[] args) {
        /* Create a boolean variable workDay and assign true
        create int variable day and assign it to 1
        As long as its workDay print" I need day off" and increase day.
        once day is 6 print "I don't need day off anymore".
         */
        boolean workDay=true;
        int day=1;
        while(workDay){
            if(day<=5){
                System.out.println(" I need a day off");
            }else {
                System.out.println("I don't need day off anymore");
                workDay=false;
            }
            day++;

        }
    }
}
