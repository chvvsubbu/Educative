package com.practice.educative.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class UnionIntersection {

    public static void main(String[] args) {
        SinglyLinkedList<Object> sl1 = new SinglyLinkedList<>();
        for (int i = 0; i < 5; i++) {
            sl1.insertAtEnd(i);

        }
        sl1.insertAtEnd(4);
        sl1.removeDuplicatesWithHashing();
        sl1.printList();

        SinglyLinkedList<Object> sl2 = new SinglyLinkedList<>();

        unionOfTwoLists(sl1,sl2);
        intersectionOfTwoLists(sl1,sl2);

    }

    public static SinglyLinkedList<Object> intersectionOfTwoLists(SinglyLinkedList<Object> sl1, SinglyLinkedList<Object> sl2) {

        sl1.removeDuplicatesWithHashing();
        sl2.removeDuplicatesWithHashing();
        return intersectionOfTwoNonRepeatedLists(sl1,sl2);
    }

    public static SinglyLinkedList<Object> intersectionOfTwoNonRepeatedLists(SinglyLinkedList<Object> sl1, SinglyLinkedList<Object> sl2) {
        SinglyLinkedList<Object> intersectionList = new SinglyLinkedList<>();
        Map<Object,Integer> intersectionCheckMap = new HashMap<>();
        Node currentNode = sl2.headNode;
        while (currentNode != null){
            intersectionCheckMap.put(currentNode.data,1);
            currentNode = currentNode.nextNode;
        }

        currentNode = sl1.headNode;
        while (currentNode != null){
            if( intersectionCheckMap.containsKey( currentNode.data ) ){
                intersectionList.insertAtEnd(currentNode.data);
            }
            currentNode = currentNode.nextNode;
        }
        return intersectionList;
    }

    public static SinglyLinkedList<Object> unionOfTwoLists(SinglyLinkedList<Object> sl1, SinglyLinkedList<Object> sl2) {

        sl1.removeDuplicatesWithHashing();
        sl2.removeDuplicatesWithHashing();
        return unionOfTwoNonRepeatedLists(sl1,sl2);
    }

    public static SinglyLinkedList<Object> unionOfTwoNonRepeatedLists(SinglyLinkedList<Object> sl1, SinglyLinkedList<Object> sl2){

        SinglyLinkedList<Object> unionList = new SinglyLinkedList<>();
        Map<Object,Integer> dupeCheckMap = new HashMap<>();
        Node currentNode =sl1.headNode;
        Node prevNode = sl1.headNode;
        unionList.headNode = prevNode;
        while ( currentNode != null){
            if( dupeCheckMap.containsKey(currentNode.data) ){
                prevNode.nextNode = currentNode.nextNode;
            }else {
                dupeCheckMap.put(currentNode.data,1);
                prevNode= currentNode;
            }
            currentNode = currentNode.nextNode;
        }

        currentNode = sl2.headNode;
        prevNode.nextNode=currentNode;

        while ( currentNode != null){
            if( dupeCheckMap.containsKey(currentNode.data) ){
                prevNode.nextNode = currentNode.nextNode;
            }else {
                dupeCheckMap.put(currentNode.data,1);
                prevNode= currentNode;
            }
            currentNode = currentNode.nextNode;
        }

        return unionList;
    }


}
