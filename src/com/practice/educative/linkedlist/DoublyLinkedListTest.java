package com.practice.educative.linkedlist;

public class DoublyLinkedListTest {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<Integer>();
        for (int i = 0; i < 1 ; i++) {
            doublyLinkedList.insertAtHead(i);
            doublyLinkedList.printList();
            System.out.println("");
        }
        doublyLinkedList.deleteByValue(0);
        System.out.println("Dwe");
        doublyLinkedList.printList();

    }
}
