import java.util.Optional;
public class SimpleDivison{
public static void main(String[] args) {
        int a = 10;
        int b = 3;

        Optional<Double> result = (b == 0) ? Optional.empty() : Optional.of((double) a / b);

        System.out.println(result.orElse(null) == null ? "Not Allowed" : result.get());
    } 
    
}

