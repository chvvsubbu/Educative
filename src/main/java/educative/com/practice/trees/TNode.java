package main.java.educative.com.practice.trees;

public class TNode {
    private int data;
    private TNode leftChild;
    private TNode rightChild;

    public TNode(int data) {
        this.data = data;
        leftChild = null;
        rightChild = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TNode leftChild) {
        this.leftChild = leftChild;
    }

    public TNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TNode rightChild) {
        this.rightChild = rightChild;
    }

}
