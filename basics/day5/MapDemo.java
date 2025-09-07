

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> studentMarks = new HashMap<>();
        studentMarks.put("Ram", 99);
        studentMarks.put("Sita", 90);
        studentMarks.put("Ram", 95);
        System.out.println("Student Name and Marks:" + studentMarks);
    }
    
}
