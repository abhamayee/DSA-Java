package linkedlist;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println(" END");
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index ; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public Node find(int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.value == value) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public int deleteLast() {
        if (size <= 1) {
            deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            deleteFirst();
        }
        if (index == size-1) {
            deleteLast();
        }
        Node prev = get(index-1);
        Node temp = prev.next;
        int val = temp.value;
        prev.next = temp.next;
        temp.next = null;
        return val;
    }

    public void insertLast(int val) {
        if (tail ==null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size += 1;
    }

    //insert using recursion
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int value, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(value, node);
            size++;
            return temp;
        }
        node.next = insertRec(value, index-1, node.next);
        return node;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    //Questions
    /* Remove duplicate elements from sorted linked list
    *  1-> 1-> 1-> 2-> 2->3*/
    public void duplicates() {
        Node node = head;
        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    /* Merged two sorted linked list
    *  1 -> 3-> 5
    * 1 -> 2-> 8->9*/
    public static LL merge(LL first, LL second) {
        Node fHead = first.head;
        Node sHead = second.head;
        LL ans = new LL();
        while (fHead != null && sHead != null) {
            if (fHead.value < sHead.value) {
                ans.insertLast(fHead.value);
                fHead = fHead.next;
            } else {
                ans.insertLast(sHead.value);
                sHead = sHead.next;
            }
        }
        while (fHead != null) {
            ans.insertLast(fHead.value);
            fHead = fHead.next;
        }
        while (sHead != null) {
            ans.insertLast(sHead.value);
            sHead = sHead.next;
        }
        return ans;
    }
}
