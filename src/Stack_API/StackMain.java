package Stack_API;

import java.util.LinkedList;
import java.util.Stack;

public class StackMain {

    public static void main(String[] args) {

        System.out.println("---Welcome To Stack And Queue Problems---");
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(70);
        stack1.push(30);
        stack1.push(56);
        System.out.println(stack1);
        System.out.println("Stack Top : " + stack1.peek());

    }
}
