
 import java.util.*;

class Job {
    String name;
    int urgency;

    Job(String name, int urgency) {
        this.name = name;
        this.urgency = urgency;
    }
}

public class smartjob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // PriorityQueue with simple comparator
        PriorityQueue<Job> pq = new PriorityQueue<>(
            (a, b) -> {
                if (a.urgency != b.urgency) {
                    return a.urgency - b.urgency; // lower urgency first
                } else {
                    return a.name.length() - b.name.length(); // shorter name first
                }
            }
        );

        // Input 5 jobs
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter job name: ");
            String name = sc.nextLine();
            System.out.print("Enter urgency (1-5): ");
            int urgency = sc.nextInt();
            sc.nextLine(); // clear newline
            pq.add(new Job(name, urgency));
        }

        // Serve jobs
        System.out.println("\nServing jobs:");
        while (!pq.isEmpty()) {
            Job j = pq.poll();
            System.out.println(j.name + " (Urgency: " + j.urgency + ")");
        }

        sc.close();
    }
}

