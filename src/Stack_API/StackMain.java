package Stack_API;

import java.util.LinkedList;
import java.util.Stack;

public class StackMain {

    public static void main(String[] args) {

        System.out.println("---Welcome To Stack And Queue Problems---");

        System.out.println("---UC1---");
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(70);
        stack1.push(30);
        stack1.push(56);
        System.out.println(stack1);
        System.out.println("Stack Top : " + stack1.peek());

        System.out.println("---UC2---");
        Stack<Integer> stack2 = new Stack<>();
        stack2.push(70);
        stack2.push(30);
        stack2.push(56);

        System.out.println(stack2);
        System.out.println("Deleted Item : " + stack2.pop());
        System.out.println(stack2);

        System.out.println("Current Stack Top : " + stack2.peek());

        System.out.println("Deleted Item : " + stack2.pop());
        System.out.println(stack2);

        System.out.println("Current Stack Top : " + stack2.peek());

        System.out.println("Deleted Item : " + stack2.pop());

        if(stack2.empty() == false){
            System.out.println("The Stack Is Not Empty");
        }
        else {
            System.out.println("The Stack Is Empty");
        }




    }
}
