package com.practice.educative.stacksandququeues;

public class EvaluatePostfixChallenge {

    public static int evaluatePostFix(String expression) {
        Character ch = null;
        Stack<Integer> stack = new Stack<>(expression.length());
        int value1;
        int value2;
        int newValue;
        for (int i = 0; i <expression.length() ; i++) {
            ch = expression.charAt(i);
            if(ch >=48 && ch < 58){
                stack.push(Integer.parseInt(ch+""));
            }
            else {
                value2 = stack.pop();
                value1 = stack.pop();
                newValue = expressionValue(value1,value2, ch);
                stack.push(newValue );
            }
        }

        return stack.pop();

    }

    public static int expressionValue(int v1, int v2, char ch){

        int result = 0;
        switch (ch){
            case '+' : result = v1 + v2;  break;
            case '-' : result = v1 - v2;  break;
            case '*' : result = v1 * v2;  break;
            case '/' : result = v1 / v2;  break;
        }
        System.out.println("expression value is: " + result);
        return result;
    }

    public static void main(String[] args) {
        String s = "921*-8-4+";
        System.out.println(("result is: " + evaluatePostFix(s)) );
    }
}
