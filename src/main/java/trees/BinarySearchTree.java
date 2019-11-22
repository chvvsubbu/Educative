package com.practice.educative.trees;

public class BinarySearchTree {

    private TNode root;

    public TNode getRoot() {
        return root;
    }

    public void setRoot(TNode root) {
        this.root = root;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public boolean add(int value){

        if(isEmpty()){
            root = new TNode(value);
            return true;
        }

        TNode currentNode = this.root;
        while (currentNode != null){

            TNode leftChild = currentNode.getLeftChild();
            TNode rightChild = currentNode.getRightChild();

            if(currentNode.getData() >value){
                if(leftChild == null){
                    leftChild = new TNode(value);
                    currentNode.setLeftChild(leftChild);
                    return true;
                }
                currentNode = currentNode.getLeftChild();
            }
            else {
                if(rightChild == null){
                    rightChild = new TNode(value);
                    currentNode.setRightChild(rightChild);
                    return true;
                }
                currentNode = currentNode.getRightChild();
            }
        }
        return false;
    }

    public void printTree(TNode current){
        if(current == null ) return;
        System.out.print(current.getData() +", ");
        printTree(current.getLeftChild());
        printTree(current.getRightChild());
    }


}
