import java.util.*;
public class Recent {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
LinkedList<String> app=new LinkedList<>();
System.out.println("enter apps:");
for(int i=0;i<=5;i++){
    String apps=sc.nextLine();
    if(app.contains(apps)){
        app.remove(apps);

    }
    app.addFirst(apps);
}
    for(String e:app){
        System.out.println(e);
    }
    sc.close();
}
    }
    

