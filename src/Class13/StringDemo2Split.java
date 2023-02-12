package Class13;

public class StringDemo1 {
    public static void main(String[] args) {
        // Pattern
        String str="ABCDEFGHIjklmnopqrstyuzxm&&7@<:!#*()";
        //
        System.out.println(str.replaceAll("[A-Z]", "#"));
        System.out.println(str.replaceAll("[a-z]", "#"));
        System.out.println(str.replaceAll("[0-9]", "#"));
        System.out.println(str.replaceAll("[A-Za-z0-9]", "#"));
        System.out.println(str.replaceAll("[^A-Za-z0-9]", " "));


    }
}

