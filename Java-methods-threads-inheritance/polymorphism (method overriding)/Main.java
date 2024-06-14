import java.util.*;
class one{
    private int a,b,c;
    Scanner sc=new Scanner(System.in);
    one(){
        a=b=c=0;
    }
    void getter(){
        a=b=c=1;
    }
    void getter(int a1){
        a=a1;
        b=12;
        c=13;
    }
    void getter(int a1,int a2){
        a=a1;
        b=a2;
        c=14;}
    void getter(int a1,int a2,int a3){
        a=a1;
        b=a2;
        c=a3;
    }
    void show(){
        System.out.println(a+"  "+b+"    "+c);
    }}
public class Main
{
	public static void main(String[] args) {
		one obj=new one();
		obj.getter(1);
		obj.show();
		
	}}

