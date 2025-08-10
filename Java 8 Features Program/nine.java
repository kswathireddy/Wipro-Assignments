import java.util.*;
import java.util.stream.Collectors;
public class nine {
  public static void main(String args[]){
    List<String>l=Arrays.asList("shiva","anitha","anil","swathi","anil");
    Map<String,Long> m=l.stream().collect(Collectors.groupingBy(n->n,Collectors.counting()));
    System.out.println(m);
  }
}
