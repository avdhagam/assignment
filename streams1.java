import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class streams1 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,3,4);
        double average = arr.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println("average: "+average);

    }
}
