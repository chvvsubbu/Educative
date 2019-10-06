package com.practice.educative.linkedlist;

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
}
