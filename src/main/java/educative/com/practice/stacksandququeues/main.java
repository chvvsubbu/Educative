package main.java.educative.com.practice.stacksandququeues;

public class main {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>(5);
        System.out.print("Elements pushed into the stack: ");
        for (int i = 0; i < 5; i++) {
            stack.push(i);
            System.out.print(i + " ");
        }
        System.out.println("\n Is stack full? \n"+ stack.isFull());
        System.out.println("Elements poped from the stack");

        for (int i = 0; i < 5 ; i++) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println("\n Is stack empty? \n"+stack.isEmpty());
    }
}
