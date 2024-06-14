import java.util.*;
class oviya{
    void julie(){
        System.out.println("oviya nallaval");
    }
}
class  gayathiri extends oviya{
    void julie(){
        System.out.println("oviya oru fraudu 420");
    }
}
class Main{
    public static void main(String d[]){
        gayathiri obj=new gayathiri();
        obj.julie();
        oviya obj1=new oviya();
        obj1.julie();
    }
}
//Method over riding
