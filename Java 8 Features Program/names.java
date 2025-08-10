import java.util.*;
public class names {
    public static void main(String args[]){
        List<String>l=Arrays.asList("ravi","shiva","anil","arjun","mine");
       l.stream().filter(n->n.startsWith("a")).forEach(n->System.out.println(n));
    }
    
}
