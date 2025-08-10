import java.util.*;
public class six {
    public static void main(String args[]){
        List<String>l=Arrays.asList("madhuri","vivek","mithuna","anil","mouni");
long result=        l.stream().filter(n->n.length()<5).count();
        System.out.println(result);
    }
    
}
