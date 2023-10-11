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
    }
}
