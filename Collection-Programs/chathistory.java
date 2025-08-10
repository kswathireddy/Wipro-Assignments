import java.util.*;

public class chathistory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> chat = new ArrayDeque<>();

        System.out.println("Enter messages:");

        for (int i = 0; i < 5; i++) {
            String message = sc.nextLine();

            
            if (chat.size() == 4) {
                chat.removeFirst();
            }

        
            chat.addLast(message);
        }

        
        System.out.println("\nChat Box (last 4 messages):");
        for (String msg : chat) {
            System.out.println(msg);
        }

        sc.close();
    }
}






