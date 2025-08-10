

@FunctionalInterface
interface pointer{
    void print();
}
public class printer {
public static void main(String []args){
    pointer p=()->System.out.println("printing is done");
    p.print();
}
    
}
