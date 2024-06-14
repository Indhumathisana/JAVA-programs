import java.io.*;
import java.lang.*;
class tele{
    tele(){
        spl();}
    void spl(){
         System.out.println("You can make call");}}
class phone extends tele{
   
    phone(){           feat();       }
        void feat(){       System.out.println("with clear audio and voice quality");   }}
class MI extends phone{
    int f_cam,b_cam,pro,battery;
    MI(){
        f_cam=64;    b_cam=128;    pro=816;       battery=6500;
        showMI();
    }
    void showMI(){
        System.out.println("              Welcome to MI section");
        System.out.println("    Our product have "+f_cam+"mp Front camera");
        System.out.println("    Our product have "+b_cam+"mp back camera");
        System.out.println("    Our product have "+pro+"Ghz intel processor");
        System.out.println("    Our product have "+battery+"Mah battery");
        System.out.println("--------------------------------------------------------"); } }
class vivo extends phone{
    int f_cam,b_cam,pro,battery;
    vivo(){
        f_cam=32;
        b_cam=64;
        pro=713;
        battery=5500;
        showvivo();}
    void showvivo(){
        System.out.println("              Welcome to VIVO section");
        System.out.println("    Our product have "+f_cam+"mp Front camera");
        System.out.println("    Our product have "+b_cam+"mp back camera");
        System.out.println("    Our product have "+pro+"Ghz intel processor");
        System.out.println("    Our product have "+battery+"Mah battery");
        System.out.println("--------------------------------------------------------");} }
class oppo extends phone{
    int f_cam,b_cam,pro,battery;
    oppo(){
        f_cam=128;
        b_cam=256;
        pro=1024;
        battery=8500;
        showoppo();}
    void showoppo(){
        System.out.println("              Welcome to OPPO section");
        System.out.println("    Our product have "+f_cam+"mp Front camera");
        System.out.println("    Our product have "+b_cam+"mp back camera");
        System.out.println("    Our product have "+pro+"Ghz intel processor");
        System.out.println("    Our product have "+battery+"Mah battery");
        System.out.println("--------------------------------------------------------");}}
class Main {
 public static void main (String[] args) {
	    MI note10=new MI();
	    oppo pro11=new oppo();
	    vivo v7=new vivo();}}
