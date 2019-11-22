package main.java.linkedlist;

public class NthElementChallenge {

    public static Node nthElementFromEnd(SinglyLinkedList singlyLinkedList, int n){
        
        Node slowNode = singlyLinkedList.headNode;
        Node fastNode = singlyLinkedList.headNode;
        for (int i = 0; i <= n; i++) {
            if(fastNode.nextNode == null) return null;
            fastNode= fastNode.nextNode;
        }

        while (fastNode.nextNode != null){
            slowNode = slowNode.nextNode;
            fastNode= fastNode.nextNode;
        }
        return slowNode;
        
    }
}
