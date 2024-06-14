import java.util.*;
class Main{
    public static void main (String[] args) {
       int a=5;
       System.out.println(a);
       Integer b=a;               //implicit auto boxing 
       System.out.println(b);
 Integer c=Integer.valueOf(a);    //auto boxing using method
      System.out.println(c);  
      int d=b;                   //implicit un boxing
      System.out.println(d);
      int e=c.intValue();       //un boxing using method
      System.out.println(e);
String s=Integer.toString(a);//converting integer val to string
      System.out.println(s);
String g=Integer.toHexString(b);//converting int val to hexadeci
      System.out.println(g);
      int k=Integer.rotateLeft(a,1);//leftshift
      System.out.println(k+"yfhv");
String k1=Integer.toString(Integer.rotateRight(a,2));//chainig
      System.out.println(k1);
      int k3=Integer.decode(s);//hexa to deci
      System.out.println(k3);
      int k4=Integer.parseInt("23");//string to integer
      
    }
}
