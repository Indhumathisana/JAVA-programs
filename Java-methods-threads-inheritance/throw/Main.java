import java.util.*;
class Main
{
  public static void main (String[]args)
  {
    int a = 12, b = 5;
    int f[] = new int[5];
      try
    {
      int c = a / b;		                              //normal try
      throw new ArrayIndexOutOfBoundsException ();
                                                     //directs ton the catch block which is required by user
    }
    catch (ArithmeticException d)
    {
      System.out.println ("Errora");
    }
    catch (ArrayIndexOutOfBoundsException e)
    {
      System.out.println ("Errorb");
      try
      {

	System.out.println (f[6]);
      }
      catch (Exception g)
      {
	System.out.println ("vccccccc");
      }
    }
  }
}
