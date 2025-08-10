import java.util.*;
public class ten {
     public static void main(String args[]){
        List<Integer>l=Arrays.asList(1,45,34,22,12);
        l.parallelStream().forEach(n->System.out.println(n*n));
     }
    
}
