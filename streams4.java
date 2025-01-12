import java.util.Arrays;
import java.util.Optional;
import java.util.List;

public class streams4 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,4,5,6,6,7);
        int K=5;

        arr.stream()
                .filter(num -> num>K)
                .forEach(System.out::println);


    }
}
