
public class Main      //default thread main
{  public static void main(String[] anz) {
         //starting thread
    System.out.println("Main "+Thread.currentThread());
    Thread.currentThread().setPriority(1);
    System.out.println("priority "+Thread.currentThread().getPriority());
    Thread.currentThread().setName("LEO");
    System.out.println("name "+Thread.currentThread().getName());
   	}
   
}

