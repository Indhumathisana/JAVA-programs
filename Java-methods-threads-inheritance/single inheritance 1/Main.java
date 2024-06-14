import java.util.*;
import java.lang.*;
class father{
    int house;
    Scanner sc=new Scanner(System.in);
    father(){
        house=sc.nextInt();
    }
    void fish(){
        System.out.println("I know Fishing");
    }
    void driver(){
        System.out.println("I am an F1 racer");
    }
    
}
class child extends father{
    String car;
    child(){
        car=sc.next();
    }
    void vty(){
        System.out.println("I am a vetty officer");
    }
}
class Main{
    public static void main(String jcd[]){
        child dora =new child();
        System.out.println(dora.house+"BHK House");
        dora.fish();
        dora.driver();
        System.out.println("I have a new "+dora.car+" car");
        dora.vty();
    }
}

