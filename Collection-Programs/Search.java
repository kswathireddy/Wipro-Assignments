import java.util.ArrayDeque;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> aq = new ArrayDeque<>();

       System.out.println("Enter javasearch terms:");

        for (int i = 0; i < 4; i++) {
            System.out.print("Search " + (i + 1) + ": ");
            String term = sc.nextLine();

            // If size is 3, remove java oldest (front)
            if (aq.size() == 3) {
                aq.removeFirst();
            }

            // Add new term to end
            aq.addLast(term);
        }

        // Final search history
        System.out.println("\nLast 3 search terms:");
        for (String s : aq) {
            System.out.println(s);
        }

        sc.close();

        
 
        
    }
    
    
}
