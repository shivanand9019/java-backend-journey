import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String,Integer> freq = new HashMap<>();

        String text = "Hello Java";

        for(String word : text.split(" ")){
            freq.put(word,freq.getOrDefault(word,0)+1);

        }
        System.out.println("Word Frequencies:"+freq);
    }
    
}
