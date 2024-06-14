import java.util.Scanner;
class Laptop{
   Scanner sc=new Scanner(System.in);
   Laptop(){
      
   }
   void port()
   {
      System.out.println("charging and transfer of files");
   }
   void ethernetport()
   {
      System.out.println("cable network facility");
   }
   void webcam()
   {
      System.out.println("capturing photos and videos");
   }
}
class HP extends Laptop{
   HP(){
                                               //default constructor
   }
   void graphics(){
      System.out.println("EFX animations");
   }
}

class Main{
   public static void main (String args[]){
      HP pavilion=new HP();
      pavilion.port();
      pavilion.ethernetport();
      pavilion.webcam();
      pavilion.graphics();
   }
}
