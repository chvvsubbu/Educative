package main.java.educative.com.practice.linkedlist;

public class CheckReverse {

    public static <T> void reverse(SinglyLinkedList<T> linkedList){

        Node temp, currentNode=linkedList.headNode, prev = linkedList.headNode;

        while ((currentNode != null)){
            if(currentNode != prev){
                temp = currentNode.nextNode;
                currentNode.nextNode = prev;
                prev = currentNode;
                currentNode = temp;
            }
        }
        linkedList.headNode=prev;
    }
}
