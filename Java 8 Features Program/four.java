interface A{
    void pass();
    default void show(){
        System.out.println("display done");
    }
}
public class four {
    public static void main(String []args){
        A a1=()->System.out.println("passing is done");
        a1.pass();
        a1.show();
    }

    
}
