import java.util.*;

public class Reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> tasks = new LinkedList<>();

        System.out.println("Enter 4 tasks:");

        for (int i = 0; i < 4; i++) {
            String task = sc.nextLine();

            // If task ends with '1', add to front
            if (task.endsWith("1")) {
                tasks.addFirst(task);
            } else {
                tasks.addLast(task);
            }
        }

        // Print in reverse
        System.out.println("Tasks in reverse order:");
        for (int i = tasks.size() - 1; i >= 0; i--) {
            System.out.println(tasks.get(i));
        }

        sc.close();
    }
}

    
