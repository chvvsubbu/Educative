package main.java.linkedlist;

public class SinglylisnkedListTest {

    public static void main(String[] args) {
            // checkUnionOfTwoLists();
            // checkIntersectionOfTwoLists();
             checkNthNodeFromEnd();
    }

    private static void checkNthNodeFromEnd() {
        SinglyLinkedList<Object> slList1 = new SinglyLinkedList<>();
        for (int i = 1; i <= 10; i++) {

            slList1.insertAtEnd(i);
        }
        slList1.printList();

        Node nthFromEnd = NthElementChallenge.nthElementFromEnd(slList1,3);
        System.out.println("nth node from end is:" + nthFromEnd.data);
    }

    private static void checkIntersectionOfTwoLists() {
        SinglyLinkedList<Object> slList1 = new SinglyLinkedList<>();
        for (int i = 1; i <= 1; i++) {

            slList1.insertAtEnd(i);
        }

        SinglyLinkedList<Object> slList2 = new SinglyLinkedList<>();
        for (int i = 1; i <= 11; i++) {

            slList2.insertAtEnd(i);
        }
        slList2.printList();
        System.out.println();
        SinglyLinkedList<Object> interSectionList = UnionIntersection.intersectionOfTwoLists(slList1,slList2);
        System.out.println("Intersection List is:");
        interSectionList.printList();
    }

    private static void checkUnionOfTwoLists() {

        SinglyLinkedList<Object> slList1 = new SinglyLinkedList<>();
        for (int i = 1; i <= 1; i++) {

            slList1.insertAtEnd(i);
        }

        SinglyLinkedList<Object> slList2 = new SinglyLinkedList<>();
        for (int i = 1; i <= 11; i++) {

            slList2.insertAtEnd(i);
        }

        SinglyLinkedList<Object> unionList = UnionIntersection.unionOfTwoLists(slList1,slList2);
        System.out.println("Union List is:");
        unionList.printList();

    }

    private static void checkLoop(SinglyLinkedList<Integer> slList) {
        Node currentNode = slList.headNode;
        while(currentNode.nextNode != null) {
            currentNode = currentNode.nextNode;
            if (currentNode.data.equals(5)) {
                currentNode.nextNode = slList.headNode;
                break;
            }
        }
        System.out.println(slList.detectLoop());
    }

    private static void removeDuplicates(SinglyLinkedList<Integer> slList){
        slList.removeDuplicatesWithHashing();
    }

    private static void checkFindMiddle (SinglyLinkedList<Integer> slList){
        System.out.println(slList.findMiddle().data);
    }




}
