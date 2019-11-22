package main.java.educative.com.practice.linkedlist;

public class DoublyLinkedListTest {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<Integer>();
        for (int i = 0; i < 1 ; i++) {
            doublyLinkedList.insertAtEnd(i);
            doublyLinkedList.printList();
            System.out.println("yo");
        }
        doublyLinkedList.deleteAtHead();
        doublyLinkedList.deleteAtTail();
        doublyLinkedList.printList();

    }
}
