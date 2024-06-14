import java.util.*;
public class Main
{
  static void show (int a[], int b) throws Exception
  {
    System.out.println (a[b]);
  }
  public static void main (String[]args)
  {
    System.out.println ("hello world");
    int a[]=new int[10];
  
  try
  {
    show(a,11);
  }
  catch (ArithmeticException x)
  {
    System.out.println ("Arith");
  }
  catch (NullPointerException b)
  {
    System.out.println ("null");
  }
  catch (ArrayIndexOutOfBoundsException c)
  {
    System.out.println ("indexout");
  }
  catch (Exception d)
  {
    System.out.println ("error");
  }
  finally
  {
    System.out.println ("finally i am done");
  }
}
}

