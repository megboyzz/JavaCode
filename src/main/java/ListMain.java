public class ListMain {

    public static void main(String[] args) {

        LinkedIntList list = new LinkedIntList();

        list.asLinkedIntList(1,2,3,4,5);

        System.out.println(list);

        list.firstLast();

        System.out.println(list);


        LinkedIntList list1 = new LinkedIntList();

        list1.asLinkedIntList(14, 8, 14, 12, 1, 14, 11, 8, 8, 10, 4, 9, 1, 2, 5, 2, 4, 12, 12);

        list1.removeDuplicates();

        System.out.println(list1);

    }

}
