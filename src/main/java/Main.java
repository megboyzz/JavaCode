import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//1
public class Main {
    public static List<Integer> alternate(List<Integer> list1, List<Integer> list2) {
        List<Integer> mergedList = new ArrayList<>();

        int size = Math.max(list1.size(), list2.size());
        for (int i = 0; i < size; i++) {
            if (i < list1.size()) {
                mergedList.add(list1.get(i));
            }
            if (i < list2.size()) {
                mergedList.add(list2.get(i));
            }
        }

        return mergedList;
    }

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 10);

        System.out.println(alternate(list1, list2));

    }

}
