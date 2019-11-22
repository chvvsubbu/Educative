package main.java.educative.com.practice.linkedlist;

public class DoublyLinkedList<T> {
    public Node headNode;
    public Node tailNode;
    public  int size;

    public DoublyLinkedList() {
        this.headNode = null;
        this.tailNode = null;
        this.size = 0;
    }

    public Node getHeadNode() {
        return headNode;
    }

    public Node getTailNode() {
        return tailNode;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        if(this.headNode == null && this.tailNode == null)
            return true;
        return false;
    }

    public void insertAtHead(T data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode=this.headNode;
        if(! isEmpty()){
            headNode.prevNode=newNode;
        }else {
            tailNode=newNode;
        }
        this.headNode= newNode;
        size++;
    }

    public void insertAtEnd(T data) {
        Node newNode = new Node();
        newNode.data = data;
        if(isEmpty()){
            headNode= tailNode =newNode;
            return;
        }
        newNode.prevNode= tailNode;
        tailNode.nextNode= newNode;
        tailNode=newNode;
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
        else
            tailNode = null;
        size --;
    }

    public void deleteAtTail() {
        if(isEmpty()){
            return;
        }
        this.tailNode= this.tailNode.prevNode;
        if(tailNode != null)
            tailNode.nextNode = null;
        else
            headNode = null;
        size--;
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
