import java.util.*;
interface machine
{
  void select ();
}				          //abstract method}
interface model extends machine
{
  void load ();
  void rinse ();
  void wash ();
}
class lg implements model
{
  Scanner sc = new Scanner (System.in);
  int c = sc.nextInt ();
  public void select ()
  {
    if (c == 1)
      {
	System.out.println ("ON");
	load ();
      }
    else
      {
	System.out.println ("OFF");
      }
  }
  public void load ()
  {
    int val = sc.nextInt ();
    if (val <= 6)
      {
	System.out.println ("start");
	wash ();
      }
    else
      {
	System.out.println ("overload");
      }
  }
  public void wash ()
  {
    System.out.println ("started");
    rinse ();
  }
  public void rinse ()
  {
    System.out.println ("rinsing");
    System.out.println ("Done");
}
}

class Main
{
  public static void main (String fs[])
  {
    lg input = new lg ();
      input.select ();
}
}				//https://onlinegdb.com/P72pHG0kv}
