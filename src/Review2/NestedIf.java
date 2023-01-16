package Review2;

public class NestedIf {
    public static void main(String[] args) {
         //in NestedIf we have two If (outer and inner) where inner is always depends on outer once.
        Boolean Vaccine=false;
        int Dose=2;
        if(Vaccine){
            System.out.println("How many shot do you have");
        }if(Dose==1){
            System.out.println("you need a second dose");
        }else{
            System.out.println("you are fully vaccinated");
        }

    }
}
