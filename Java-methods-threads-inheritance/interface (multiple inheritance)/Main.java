import java.util.*;
interface grandpa{
    void get();
    void set();
}
interface father extends grandpa{
   void f_show();
}
interface mother extends grandpa{
   void m_show();
}
class son implements father,mother{
   public void get(){                                 
      System.out.println("get");
   }
   public void set(){
      System.out.println("set");
   }
   public void f_show(){
      System.out.println("f_show");
   }
    public void m_show(){
      System.out.println("m_show");
    }
}
public class Main
{
	public static void main(String[] args) {
	son o=new son();
	o.m_show();
	}
}


