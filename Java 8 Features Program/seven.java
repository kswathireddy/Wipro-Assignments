import java.util.*;
import java.util.stream.Collectors;
public class seven {
    public static void main(String args[]){
        List<Integer>l=Arrays.asList(1,23,45,44,6);
        List<Integer>a=l.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(a);
    }

    
}
