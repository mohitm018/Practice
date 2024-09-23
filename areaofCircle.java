package Main.Fuctions;
import java.util.*;

public class areaofCircle {
    public static double areaOfCircle(double radius){
        double pie= Math.PI;
        return pie*radius*radius;
    }
    public static void main(String[]args){
        Scanner scn =  new Scanner(System.in);
        double rad= scn.nextDouble();

        System.out.println(areaOfCircle(rad));
    }
}
