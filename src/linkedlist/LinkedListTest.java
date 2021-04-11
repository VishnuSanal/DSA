package linkedlist;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(12);
        list.insert(43);
        list.insert(23);
        list.insert(56);
        list.insert(89);
        list.insert(93);

        System.out.println(list.getString());
    }
}
