import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class streams3 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,5,6,9,12,19,34);
        int K=4;
        // we are using optional here bc the kth number may or may not be present
        Optional<Integer> ans= nums.stream()
                .sorted((a,b)->b-a)
                .skip(K-1)
                .findFirst();
        ans.ifPresent(System.out::println);
    }
}
