package Class4;

public class NestedIf3 {
    public static void main(String[] args) {
        boolean studyHard=true;
        int salary=90000;

        if(studyHard){
            System.out.println("we get the job");

            if(salary>100000){
                System.out.println("lets buy a telsa");
            }else{
                System.out.println("lets buy toyota");
            }
        }else{
            System.out.println("it might take a little for us to get the job");
        }

    }
}
