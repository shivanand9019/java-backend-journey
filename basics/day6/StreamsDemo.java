import java.util.*;

public class StreamsDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,5,56,7,8);

        int sum = numbers.stream().filter(n-> n%2 ==0)
        .map(n->n*n)
        .reduce(0,Integer::sum);

        System.out.println("Sum of Squares of even numbers:"+sum);
        
    }
    
} 
