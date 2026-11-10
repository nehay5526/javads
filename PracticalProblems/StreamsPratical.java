
import java.util.stream.IntStream;

public class StreamsPratical {
    public static void main(String[] args) {
        int start = 1;
        int end = 11; 
        int sum =  IntStream.range(start, end).filter(n -> n % 2 == 0).sum();
        System.out.println("Sum of even numbers from " + start + " to " + (end - 1) + " is: " + sum);

    }
}
