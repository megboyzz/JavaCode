import java.nio.channels.MulticastChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//3
public class Unique {


    public static boolean isUnique(Map<String, String> map){

        if(map.isEmpty()) return true;

        List<String> values = new ArrayList<>(map.values());

        for(int i = 0; i < values.size(); i++){
            String s = values.get(i);
            values.remove(s);
            if(values.contains(s)) return false;
        }

        return true;

    }

    public static void main(String[] args) {

        Map<String, String> map = Map.of(
                "Marty", "Stepp",
                "Stuart", "Reges",
                "Jessica", "Miller",
                "Amanda", "Camp",
                "Hal", "Perkins"
        );

        System.out.println(isUnique(map));

        Map<String, String> map1 = Map.of(
                "Marty", "Stepp",
                "Stuart", "Reges", //повтор
                "Jessica", "Miller",
                "Amanda", "Reges", //повтор
                "Hal", "Perkins"
        );

        System.out.println(isUnique(map1));


        Map<String, String> map2 = Map.of();

        System.out.println(isUnique(map2));

    }

}
