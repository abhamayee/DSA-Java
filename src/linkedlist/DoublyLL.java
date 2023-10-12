package linkedlist;

public class DoublyLL {
    private Node head;
    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.val + "->");
            node = node.next;
        }
        System.out.println(" END");
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;
        if (head == null) {
            node.prev = null;
            node.next = null;
            head = node;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }

    public void insert(int after, int val) {
        Node p = find(after);
        if (p == null) {
            System.out.println(" does not exist");
            return;
        }
        Node node = new Node(val);
        node.prev = p;
        node.next = p.next;
        p.next = node;
        if (node.next != null) {
            node.next.prev = node;
        }
    }

    public Node find(int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.val == value) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
