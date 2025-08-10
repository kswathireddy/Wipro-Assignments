import java.util.*;
import java.util.stream.Collectors;
public class Eight 
{
    public static void main(String args[]){
        List<String>cities=Arrays.asList("chennai","goa","hyderabad","chicago");
       String l= cities.stream().collect(Collectors.joining(","));
       System.out.println(l);
    }
    
}
