package Class10;

public class D2Arrays {
    public static void main(String[] args) {
        //a 2D Arrays which can hold 3 or multiple D arrays
        // in the demo below we have D2 arrays that contains 3  D arrays.

        //Syntax
       // String [][]ThomsTrain=new String [D arrays][ element index in the array]
        String [][] thomsonTrain=new String[3][3];
        String[]Cabin0={"Adam","John","Asli"};
        String[]Cabin1={"Darira","Abeera","Safi"};
        String[]Cabin2={"Omar","Suliman","Ab.Hamid"};

        thomsonTrain[0]=Cabin0;
        thomsonTrain[1]=Cabin1;
        thomsonTrain[2]=Cabin2;
        //in first [] we specify the address of 1 D array
        System.out.println(thomsonTrain[1][1]);




    }
}
