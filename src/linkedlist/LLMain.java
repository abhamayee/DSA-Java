package linkedlist;

public class LLMain {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(10);
        list.insertLast(15);
        list.display();
        list.insert(25, 3);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        list.deleteLast();
        list.insertFirst(30);
        list.insertFirst(35);
        list.display();
        list.delete(2);
        list.display();
        System.out.println("list.find(26) = " + list.find(26));

        //Doubly linked list
        DoublyLL dll = new DoublyLL();
        dll.insertFirst(3);
        dll.insertFirst(5);
        dll.insertFirst(10);
        dll.display();
        dll.insertLast(25);
        dll.display();
    }
}
