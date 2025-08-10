
import java.util.*;

class Patient {
    String name;
    int severity;
    int id; 

    Patient(String name, int severity, int id) {
        this.name = name;
        this.severity = severity;
        this.id = id;
    }

    public String toString() {
        return name + " (Severity: " + severity + ", ID: " + id + ")";
    }
}

public class HospitalQueue {
    public static void main(String[] args) {
       
        Comparator<Patient> patientComparator = (p1, p2) -> {
            if (p1.severity != p2.severity)
                return Integer.compare(p1.severity, p2.severity);
            else
                return Integer.compare(p1.id, p2.id);
        };

        PriorityQueue<Patient> queue = new PriorityQueue<>(patientComparator);

        
        queue.offer(new Patient("A", 3, 101));
        queue.offer(new Patient("B", 2, 102));
        queue.offer(new Patient("C", 1, 103));
        queue.offer(new Patient("D", 2, 100)); // older than B
        queue.offer(new Patient("E", 4, 104));

        if (queue.size() > 5) {
            System.out.println("Queue is full, cannot add more patients.");
        }

        
        System.out.println("Treatment order:");
        while (!queue.isEmpty()) {
            System.out.println("Treating: " + queue.poll());
        }
    }
}
