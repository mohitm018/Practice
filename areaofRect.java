package Main.Fuctions;
import java.util.*;
public class areaofRect {
    public static double areaofRect(double x,double y){
        return  x*y;
    }
    public static  void main(String[]args){
        Scanner scn = new Scanner(System.in);
        double len = scn.nextDouble();
        double bre =  scn.nextDouble();
        System.out.println("Area of Rectangle is "+(areaofRect(len,bre)));
    }
}
