import java.util.*;
class one extends Thread{      //creating thread 1
    public void run(){         
    //overriding run method which belongs to 
    //runnable interface
	    System.out.println("Hello one");
	    System.out.println("Hello one1");
	    System.out.println("Hello one2");
	}}
class two extends Thread{    //creating threading 2
    public void run(){
	    System.out.println("Hello two");
	    System.out.println("Hello two1");
	    System.out.println("Hello two2");
	}}
public class Main      //default thread main
{  public static void main(String[] anz) {
    one o=new one();      //creating object for thread 1
    two t=new two();     //creating object for thread 2
    o.start();          //starting thread
    t.start();           //starting thread
    System.out.println("Main");
    System.out.println("Main1");
    System.out.println("Main2");	}}

