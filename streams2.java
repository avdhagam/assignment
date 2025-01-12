import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streams2
{
    public static void main(String[] args) {
        String s = "heymynameisavani";
        //List<Character> chars = s.chars()
         List<Character> result = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c->c, LinkedHashMap::new,Collectors.counting()))
                 .entrySet()
                 .stream()
                 .filter(entry -> entry.getValue() ==1)
                 .map(Map.Entry::getKey)
                 .collect(Collectors.toList());
         System.out.println(result);
    }
}
