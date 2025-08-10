import java.util.concurrent.*;

class Task {
    int id;

    Task(int id) {
        this.id = id;
    }

    public String toString() {
        return "Task " + id;
    }
}

public class TaskFlow {
    public static void main(String[] args) {
        LinkedBlockingQueue<Task> stage1 = new LinkedBlockingQueue<>();
        LinkedBlockingQueue<Task> stage2 = new LinkedBlockingQueue<>();

        
        for (int i = 1; i <= 5; i++) {
            stage1.add(new Task(i));
        }

       
        while (!stage1.isEmpty()) {
            Task task = stage1.poll();
            System.out.println("Processing in Stage 1: " + task);
            if (task.id % 2 == 0) {
                stage2.add(task);
            }
        }

        
        System.out.println("\nStage 2 Tasks (Even IDs Only):");
        for (Task task : stage2) {
            System.out.println(task);
        }
    }
}

