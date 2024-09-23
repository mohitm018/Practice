package Main.Fuctions.examples;
import java.util.*;
public class AreaofSphere {
    public static double Spherearea(double rad){
        double pi= Math.PI;
        double area = (4*pi*rad*rad*rad)/3;
        return (int) Math.ceil(area);
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);

        double radius = scn.nextDouble();
        System.out.println(Spherearea(radius));

    }
}
