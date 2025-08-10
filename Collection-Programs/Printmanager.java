import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
public class Printmanager {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayBlockingQueue<String> queue=new ArrayBlockingQueue<>(3);
     System.out.println("Enter 5 print jobs:");

        for (int i = 0; i < 5; i++) {
            String job = sc.nextLine();
            if (!queue.offer(job)) {
                System.out.println("Queue full! Skipping job: " + job);
            }
        }
        System.out.println("\nPrinting jobs:");
        while (!queue.isEmpty()) {
            System.out.println("Printing: " + queue.poll());
        }
        sc.close();

    }   
    }

