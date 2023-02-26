package HomeWorkClass29;

import java.util.LinkedHashSet;

public class Task1 {
    public static void main(String[] args) {
        /*
        Create a Set of cities in which you want to make sure that insertion order is maintained.
        Then remove any city that starts with “A”;
         */

        //  We use the linkedhashset for this question.

        LinkedHashSet<String>Cities=new LinkedHashSet<>();
        Cities.add("Abania");
        Cities.add("Kentaky");
        Cities.add("Texas");
        Cities.add("south Dakota");
        Cities.add("Arizona");
        System.out.println(Cities);

        //Remove any city that start with starts with "A", we use the lambda Expression.
        Cities.removeIf(X -> X.startsWith("A"));
        System.out.println(Cities);






    }
}

