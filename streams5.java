import java.util.Arrays;
import java.util.List;

public class streams5 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,3,4,5,6,-2,-6);

        int prod = arr.stream()
                .filter(n -> n>=0)
                .reduce(1, (a,b)->a*b);

        System.out.println(prod);
    }
}
