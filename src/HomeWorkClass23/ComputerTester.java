package HomeWorkClass23;

public class ComputerTester {
    public static void main(String[] args) {

        Computer computer = new Dell();
        computer.Data();
        computer.StoresData();
        computer.ProcessData();


        Computer[] machine={new Dell(), new HP(),new Apple(), new Lenovo()};
        for(Computer machines:machine){
            computer.Data();
            computer.StoresData();
            computer.ProcessData();
        }


        }
    }

