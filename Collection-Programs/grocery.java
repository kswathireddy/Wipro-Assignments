import java.util.*;
public class grocery {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayDeque<String> queue=new ArrayDeque<>();
        System.out.println("enter name:");

        for(int i=0;i<4;i++){
            String name=sc.nextLine() ;
            if(name.length()%2==0){
                queue.addFirst(name);
            }else{
                queue.addLast(name);
            }

        }
        System.out.println("after process:");
        for(String i:queue){
            System.out.println(i);
        }
        sc.close();
    }
    
}
