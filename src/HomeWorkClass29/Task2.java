package HomeWorkClass29;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {

         /*
    Create a Set collection that will hold Objects of Student Type. In this set we do not care about the insertion order.
     Each student object should have name and studentID. Display name of each student.

     */
        HashMap<String, Integer> Students=new HashMap<>();
        Students.put("Ahmad",12456);
        Students.put("Omar",1245);
        Students.put("Mosawer",1266);
        Students.put("Safi",12488);
        Students.put("Chandrmokey",12477);

        // to display the name of each student, we use Enhance for loop.

       for(Map.Entry<String,Integer>entry:Students.entrySet()){
           System.out.println(entry);
       }




    }


}
