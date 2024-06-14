import java.util.*;
interface name{
    int a=12;
     void show();
    void get();
}
class new1 implements name{
    public void show(){
        System.out.println("show");
    }
    public void get(){
        System.out.println("Get");
    }
}
class Main{
    public static void main(String fs[]){
        new1 o=new new1();
        o.show();
        o.get();
        System.out.println(o.a);
    }
}
