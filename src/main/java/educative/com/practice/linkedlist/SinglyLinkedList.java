package main.java.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class SinglyLinkedList<T> {

    public Node headNode;
    public int size;

    public SinglyLinkedList() {
        headNode = null;
        size = 0;
    }

    public boolean isEmpty(){
        if(headNode == null) return true;
        return false;
    }

    public void insertAtHead(T data){

        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode = headNode;
        headNode = newNode;
        size++;
    }

    public void insertAtEnd(T data){
        Node newNode = new Node();
        newNode.data = data;
        if(isEmpty()) {
            insertAtHead(data);
            return;
        }
        Node nodeIterator = headNode;
        while(nodeIterator.nextNode != null)
            nodeIterator = nodeIterator.nextNode;
        nodeIterator.nextNode= newNode;
        size++;
    }

    public void insertAfter(T data, T previous){
        Node newNode = new Node();
        newNode.data = data;
        Node nodeIterator = headNode;
        while (nodeIterator.data != previous)
            nodeIterator = nodeIterator.nextNode;
        newNode.nextNode=nodeIterator.nextNode;
        nodeIterator.nextNode = newNode;
        size++;
    }

    public void printList() {
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }

        Node iterator = headNode;
        System.out.print("List : ");
        while (iterator.nextNode != null){
            System.out.print(iterator.data.toString()+" -> ");
            iterator = iterator.nextNode;
        }
        System.out.print(iterator.data.toString()+" -> null");
    }

    boolean searchNode(T data){
        Node currentNode = headNode;
        while (currentNode != null) {
            if (currentNode.data.equals(data))
                return true; //value found
            currentNode = currentNode.nextNode;
        }
        return false; //value not found
    }

    public void deleteAtHead() {
        if(isEmpty())
            return;
        headNode = headNode.nextNode;
        size--;
    }

    public  void deleteByValue(T data){
        if(isEmpty())
            return;
        Node currentNode = this.headNode;
        Node prevNode = null; //previous node starts from null

        if(currentNode.data.equals(data)) {
            //data is at head so delete from head
            deleteAtHead();
            return;
        }
        while (currentNode != null ){
            if(currentNode.data.equals(data)){
                prevNode.nextNode = currentNode.nextNode;
                return;
            }
            prevNode = currentNode;
            currentNode = currentNode.nextNode;
        }
    }

    public int length() {
        int count = 0;
        Node currentNode = headNode;
        while (currentNode != null){
            count++;
            currentNode= currentNode.nextNode;
        }
        return count;
    }

    public void reverseList(){
        Node next, currentNode=headNode, prev = null;

        while ((currentNode != null)){
            next = currentNode.nextNode;
            currentNode.nextNode = prev;
            prev = currentNode;
            currentNode = next;
        }
        headNode =prev;
    }

    public boolean detectLoop(){
        Node slowNode = this.headNode;
        Node fastNode = this.headNode;
        while (slowNode!= null && fastNode != null && fastNode.nextNode!= null){
            if(slowNode == fastNode) return true;
        }
        return false;

    }

    public Node findMiddle(){
        Node slowNode = this.headNode;
        Node fastNode = this.headNode;
        while (slowNode!= null && fastNode != null && fastNode.nextNode!= null){

            fastNode = fastNode.nextNode.nextNode;
            if(fastNode != null)
                slowNode = slowNode.nextNode;
        }
        return slowNode;

    }

    public void removeDuplicatesWithHashing() {
        Node prev = this.headNode;
        Node currentNode = this.headNode.nextNode;
        Map<Object, Integer> dupeCheckMap = new HashMap<>();
        dupeCheckMap.put(this.headNode.data,1);
        while (currentNode!=null){
            if( dupeCheckMap.containsKey(currentNode.data) ){
                prev.nextNode=currentNode.nextNode;
            }else {
                dupeCheckMap.put(currentNode.data,1);
                prev = currentNode;
            }
            currentNode = currentNode.nextNode;
        }
    }
}
