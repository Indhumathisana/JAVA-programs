import java.util.*;
import java.util.Scanner;
interface HS{
   void power();
   void optimum_temp();
   void straight();
   void curl();
   void crimpe();
}
class philips implements HS{
   Scanner sc=new Scanner(System.in);
   int a=sc.nextInt();
   void power(){
      if(a==1)
      System.out.println("ON");
      else
      System.out.println("OFF");
   }
   int temp=sc.nextInt();
   void optimum_temp()
   {
      if(temp==60)
      System.out.println("ready to use");
   }
   int temp1=sc.nextInt();
   void straight(){
      if(temp1>60 && temp1<=90)
      System.out.println("ready to straight");
   }
   int temp2=sc.nextInt();
   void curl(){
      if(temp2>90 && temp2<=180)
      System.out.println("ready to curl");
   }
   int temp3=sc.nextInt();
   void crimpe(){
      if(temp3>180 && temp3<=190)
      System.out.println("ready to crimpe");
      else
      System.out.println("caution:hair may cause damage");
   }
   
}

class Main{
   public static void main(String args[]){
      philips p=new philips();
      p.power();
      p.optimum_temp();
      p. straight();
      p.curl();
      p.crimpe();
   }
}
