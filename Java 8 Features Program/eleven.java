import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class eleven {
    public static void main(String args[]){
        List<String>l=Arrays.asList("anil","aruna","mamatha","swetha");
        Predicate<String> p1=l1->l1.startsWith("a");
        Predicate<String> p2=l1->l1.endsWith("a");
List<String>l2=l.stream().filter(p1.and(p2)).collect(Collectors.toList());
System.out.println(l2);

    }
    
}
