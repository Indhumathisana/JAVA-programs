import java.util.*;
class Cheemsbro{
      
      void doggy(){
         System.out.println("nane picha edukuren machan");
      }
}
class Doglina extends Cheemsbro {
      void doggy(){
         System.out.println("anything for u bae");
      }
}
class Main{
   public static void main(String args[]){
      Cheemsbro treat=new Cheemsbro();
      treat.doggy();
      Doglina treat1=new Doglina();
      treat1.doggy();
      
   }
}
