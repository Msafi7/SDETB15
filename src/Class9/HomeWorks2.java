package Class9;

public class HomeWorks {
    public static void main(String[] args) {
        // print 1-50 except those divisibale by3.

        /*for (int i = 1; i <=50; i++) {
            if(i%3!=0){
                System.out.println(i);
            }

        }*/
        for (int i = 1; i <50; i++) {
            if(i%3==0){
                continue;
            }else {
                System.out.println(i);
            }

        }
    }
}
