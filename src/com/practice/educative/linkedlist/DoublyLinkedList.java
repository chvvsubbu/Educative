package com.practice.educative.linkedlist;

public class DoublyLinkedList<T> {
    public Node headNode;
    public  int size;

    public DoublyLinkedList() {
        this.headNode = null;
    }

    public boolean isEmpty(){
        if(this.headNode == null)
            return true;
        return false;
    }

    public void insertAtHead(T data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode=this.headNode;
        newNode.prevNode=null;

        if(headNode != null){
            headNode.prevNode=newNode;
        }
        this.headNode= newNode;
        size++;
    }

    public void printList() {
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }
        Node currentNode = this.headNode;
        System.out.print("List : null <-");
        while (currentNode.nextNode != null){
            System.out.print(currentNode.data.toString()+"->");
            currentNode= currentNode.nextNode;
        }
        System.out.print(currentNode.data.toString()+"-> null");
    }

    public void deleteAtHead(){
        if(isEmpty()){
            return;
        }
        this.headNode = this.headNode.nextNode;
        if(headNode != null)
            this.headNode.prevNode = null;
        size --;
    }

    public void deleteByValue(T data){
        if(headNode == null) return;
        Node currentNode = this.headNode;
        if(data.equals(currentNode.data)){
            deleteAtHead();
            return;
        }
        while (currentNode != null){

            if(data.equals(currentNode.data)){
                currentNode.prevNode.nextNode = currentNode.nextNode;
                if(currentNode.nextNode != null){
                    currentNode.nextNode.prevNode= currentNode.prevNode;
                }
                size--;
                return;
            }
            currentNode = currentNode.nextNode;
        }
    }
}
