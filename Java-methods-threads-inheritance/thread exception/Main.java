import java.util.*;
class thread extends Thread{
   public void run(){
      try{ 
       for(int i=0;i<5;i++){
          Thread.sleep(5000);
       System.out.println("2");
       }
       }
       catch(Exception e){
           System.out.println("Therwee");
       }
   }
}
class thread2 extends Thread{
   public  void run(){
 try{ 
 for(int i=0;i<5;i++){  Thread.sleep(500);
        System.out.println("2.0");}
     
 }
        catch(Exception e){
           System.out.println("Theeee");
       }
    }
}
public class Main      //default thread main
{  public static void main(String[] anz) {
   thread obj=new thread();
   thread2 o=new thread2();
   obj.start();
   o.start();
   for(int i=0;i<5;i++)
   System.out.println("Main");}
}

