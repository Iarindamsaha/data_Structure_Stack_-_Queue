package Queue_API;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {

    public static void main(String[] args) {

        System.out.println("---Welcome To Stack And Queue Problems---");

        System.out.println("---UC3---");

        Queue<Integer> queue1 = new LinkedList<>();
        queue1.offer(56);
        queue1.offer(30);
        queue1.offer(70);
        System.out.println(queue1);
        System.out.println("Queue Head : " + queue1.peek());

        System.out.println("---UC4---");

        System.out.println("After Delete " + queue1);
        System.out.println("Deleted Item is : " + queue1.poll());
        System.out.println("After Delete " + queue1);
        System.out.println("Deleted Item is : " + queue1.poll());
        System.out.println("After Delete" + queue1);
        System.out.println("Deleted Item is : " + queue1.poll());

        if(queue1.peek() == null){
            System.out.println("The Queue Is Empty");
        }
        else {
            System.out.println("The Queue Is Not Empty || Queue Head Is : " + queue1.peek());
        }



    }
}
