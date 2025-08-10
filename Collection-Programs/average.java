import java.util.Scanner;
public class average {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("enter 5 numbers:");
        for(int i=0;i<5;i++){
            int n=sc.nextInt();
            if(n<10){
                n=n*2;
            }
            sum+=n;

        }
        double average=sum+5.0;
        System.out.println(average);
         sc.close();
    }
   

    
}
