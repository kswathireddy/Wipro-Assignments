import java.util.*;
public class undo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
Stack<String> task=new Stack<>();
System.out.println("enter 3 commands:");
String c1=sc.nextLine();
String c2=sc.nextLine();
String c3=sc.nextLine();
task.push(c1);
task.push(c2);
task.push(c3);
String last=task.pop();
String rev="";
for(int i=last.length()-1;i>=0;i--){
    rev+=last.charAt(i);
}
task.push(rev);
for(String ele :task){
    System.out.println(ele);
}
sc.close(); 
    }
   
    
}
