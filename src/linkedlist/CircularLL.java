package linkedlist;

public class CircularLL {
    private Node head;
    private Node tail;

    public CircularLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display() {
        Node node = head;
        if (head != null) {
            do {
                System.out.print(node.value + "->");
                node = node.next;
            } while (node != head);
        }
        System.out.println("HEAD");
    }

    public void delete(int value) {
        Node node = head;
        if (node == null) {
            return;
        }
        if (node.value == value) {
            head = head.next;
            tail.next = head;
            return;
        }
        do {
            Node temp = node.next;
            if (temp.value == value) {
                node.next = temp.next;
                break;
            }
            node = node.next;
        } while (node != head);
    }

    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
