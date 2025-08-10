import java.util.*;
public class namessort {
    public static void main(String args[]){
        List<String>l=Arrays.asList("shiva","raju","nani","swathi","hem");
l.stream().sorted().forEach(n->System.out.println(n));

    }
    
}
