package linkedlist;

public class LinkedList {

    private Node head;

    public void insert(int i) {

        Node n = new Node(i, null);

        if (head == null)
            head = n;
        else {
            Node node = head;

            while (node.getNext() != null) {
                node = node.getNext();
            }
            node.setNext(n);
        }
    }

    public String getString() {

        StringBuilder stringBuilder = new StringBuilder();

        Node node = head;

        while (node != null) {
            stringBuilder.append(node.getData()).append("\t");
            node = (node.getNext());
        }
        return stringBuilder.toString();
    }
}


