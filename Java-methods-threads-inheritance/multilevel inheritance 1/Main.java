import java.util.*;   //multi level inheritance
import java.lang.*;
class thatha{
    protected int land;
    int get_land(){
        return land;
    }
    Scanner sc=new Scanner(System.in);
    thatha(){
        land=sc.nextInt();
    }
}
class father extends thatha{
    private int house;
    father(){
        house=sc.nextInt();
    }
   int get_house(){
       return house;
   }
}
class child extends father{
    String car;
    child(){
        car=sc.next();
    }
}
class Main{
    public static void main(String msc[]){
        child one=new child();
        System.out.println("I have "+one.get_land()+" Acre of land");
        System.out.println("I have "+one.get_house()+" BHK house");
        System.out.println("I have "+one.car+" car");
    }
}
