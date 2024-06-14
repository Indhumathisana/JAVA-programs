import java.util.*;
import java.util.Scanner;
 abstract class WM{           //abstract class
   abstract void rinse();    //abstract method....only declaring the method
   abstract void spin();
   abstract void wash();
   
}
  abstract class LG extends WM{
        int max_load;
        int load;
   LG(){
      max_load=30;
      load=10;
   }
  
   void wash(){                              //concrete method......definition for abstract
      if(load<=max_load)
      System.out.println("the load is "+load+",washing process started");
      else
      System.out.println("over load");
   }
 }
class LG1 extends LG{
   void rinse(){
      System.out.println("rinsing");
   }
   void spin(){
      System.out.println("spining");
   }
}
 
class Main{
   public static void main(String args[]){
       LG1 r=new LG1();                       // object cannot be created for abstract class(abstract class LG)
       r.wash();                                     //thus object created for class LG1
   }
}
   
   
   




