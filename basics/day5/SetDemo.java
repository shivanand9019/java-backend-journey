
import java.util.HashSet;
import java.util.Set;



public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10); // duplicate, will not be added
        set.add(30);
        System.out.println("Set Elements:"+set);
    }
    
}
