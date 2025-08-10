import java.util.*;
public class tweleve {
    public static void main(String []args){
        List<String>l=Arrays.asList("mani","shiva","raju");
        Collections.sort(l, String::compareTo);
        System.out.println(l);
    }
    
}
