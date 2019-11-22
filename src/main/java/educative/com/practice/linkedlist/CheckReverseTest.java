package main.java.linkedlist;

public class CheckReverseTest {
    public static void main(String[] args) {

        SinglyLinkedList <Integer> slList = new SinglyLinkedList<Integer>();

        for (int i = 1; i < 10; i++) {

            slList.insertAtEnd(i);
            slList.printList();
            System.out.println("");
        }

        CheckReverse.reverse(slList);
        slList.printList();
    }
}
