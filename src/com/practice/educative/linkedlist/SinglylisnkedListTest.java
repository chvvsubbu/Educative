package com.practice.educative.linkedlist;

public class SinglylisnkedListTest {

    public static void main(String[] args) {
        SinglyLinkedList <Integer> slList = new SinglyLinkedList<Integer>();

        for (int i = 1; i < 10; i++) {

            slList.insertAtEnd(i);
            slList.printList();
            System.out.println("");
        }
        slList.deleteByValue(100);
        slList.printList();

    }
}
