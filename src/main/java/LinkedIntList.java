import java.util.List;

//11, 9
public class LinkedIntList {

    private ListNode root;

    //11
    public void firstLast(){

        if(isEmpty()) return;

        ListNode node = root;

        ListNode lastRootData = root;

        root = root.next;

        while (node.next != null) node = node.next;

        node.next = lastRootData;
        lastRootData.next = null;

    }

    //9
    public void removeDuplicates(){

        ListNode current = root;
        while (current != null) {

            ListNode runner = current;

            while (runner.next != null) {

                if (runner.next.data == current.data) runner.next = runner.next.next;
                else runner = runner.next;

            }
            current = current.next;
        }

    }

    public void asLinkedIntList(Integer... ints){

        for(int a : ints){
            add(a);
        }
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void add(int data){

        if(isEmpty()) {
            root = new ListNode();
            root.data = data;
            return;
        }

        ListNode next = root;
        while (next.next != null)
            next = next.next;

        next.next = new ListNode();
        next.next.data = data;


    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        ListNode node = root;
        builder.append("[");
        while (node != null){
            builder.append(node.data);
            if(node.next != null) builder.append(", ");
            node = node.next;
        }
        builder.append("]");

        return builder.toString();

    }

    static class ListNode {
        public int data;
        public ListNode next;
    }

}
