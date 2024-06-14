import java.util.*;
abstract class Tea{
    abstract void hotcoffee();//abstract method
    abstract void tea();
    
}
abstract class choice extends Tea{
    void hotcoffee(){           //concrete method
        System.out.println("Delicious hot coffee");
    }
}
class new1 extends choice{
    void  tea()
    {
        System.out.println("TEA");
    }
    
}
class Main{
    public static void main(String d[]){
       new1 o=new new1();
       o.tea();
       o.hotcoffee();
    }
}

