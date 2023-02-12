package HomeWorkClass23;

public class Computer {


   /*
   Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    Define common behavior within and some fields in parent class and override some of the methods in child classes
    Define some methods specific to child classes
    Create objects of child classes and store them into array. Loop through each object and execute available methods.
    */

    public void Data(){
        System.out.println("Computer Takes data as an input");
    }
    public  void StoresData(){
        System.out.println(" Computer Stores Data");
    }
    public void ProcessData(){System.out.println("Computer Processes Data");
    }

}

 class Apple extends Computer {// creating child class and overriding method from the parent Class.
     @Override
     public void Data() {
         System.out.println("Apple computer takes data as an input");
     }

     @Override
     public void StoresData() {
         System.out.println("Apple computer Stores Data");
     }

     @Override
     public void ProcessData() {
         System.out.println(" Apple Computer Processes Data");
     }
 }

 class Lenovo extends Computer {
     @Override
     public void Data() {
         System.out.println("Lenovo computer takes data as an input");
     }

     @Override
     public void StoresData() {
         System.out.println("Lenovo computer Stores Data");
     }

     @Override
     public void ProcessData() {
         System.out.println("Lenovo Computer Processes Data");
     }
 }
 class HP extends Computer{
     @Override
     public void Data() {
         System.out.println("HP computer takes data as an input");
     }

     @Override
     public void StoresData() {
         System.out.println("HP computer Stores Data");
     }

     @Override
     public void ProcessData() {
         System.out.println("HP Computer Processes Data");
     }
 }
 class Dell extends Computer{
     @Override
     public void Data() {
         System.out.println("Dell computer takes data as an input");
     }

     @Override
     public void StoresData() {
         System.out.println("Dell computer Stores Data");
     }

     @Override
     public void ProcessData() {
         System.out.println("Dell computer process Data");
     }
 }



