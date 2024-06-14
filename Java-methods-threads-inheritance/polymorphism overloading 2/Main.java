import java.util.*;
class one{
    private int a,b,c;
    Scanner sc=new Scanner(System.in);
    one(){
        a=b=c=0;
    }
  
    void getter(int a1,int a2){
      System.out.println(a1+"  "+a2+" Integer");
    }
     void getter(double a1,double a2){
      System.out.println(a1+"  "+a2+" Double");}
    void getter(String a1,String a2){
       System.out.println(a1+"  "+a2+" String");
    }
    void getter(float a1,float a2){
       System.out.println(a1+"  "+a2+" Float");
    }
   }
public class Main
{
	public static void main(String[] args) {
		one obj=new one();
		obj.getter(1.0,2.0);
		obj.getter(1.0f,2.0f);
		obj.getter(11534,1234);
		obj.getter("Eppudra","Vandhuduchi");
		
	}}                        //https://onlinegdb.com/p3CT_wdZq     


