import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


//2
public class MapTask {

    public static Map<String, Integer> reverse(Map<Integer, String> original){

        Map<String, Integer> reversed = new HashMap<>();

        /*

        for (Map.Entry<Integer, String> entry : original.entrySet()) {
            reversed.put(entry.getValue(), entry.getKey());
        }

         */

        original.forEach((key, value) -> reversed.put(value, key));

        return reversed;

    }

    public static void main(String[] args) {

        Map<Integer, String> map = Map.of(
                1, "k1",
                2, "k2",
                3, "k3",
                4, "k4",
                5, "k5"
                );

        System.out.println(reverse(map));

        Map<Integer, String> map1 = Map.of(
                1, "k1",
                2, "k2",
                3, "k4",
                4, "k4",
                5, "k4"
        );

        System.out.println(reverse(map1));
    }

}
