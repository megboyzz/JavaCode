import java.util.Arrays;
import java.util.List;

public class Guava {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Farm", "Zoo", "Car", "Apple", "Bee", "Golf", "Bee", "Dog", "Golf", "Zoo", "Zoo", "Bee", "Bee", "Apple");
        list.sort(String::compareTo);

        System.out.println(list);

    }

}
