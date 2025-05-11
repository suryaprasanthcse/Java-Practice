import java.util.Scanner;

import static java.awt.geom.Point2D.distance;

public class Twopoints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("___CALCULATION OF TWO POINTS___");
        System.out.print("Enter the x1:");
        double x1 = in.nextFloat();
        System.out.print("Enter the y1:");
        double y1 = in.nextFloat();
        System.out.print("Enter the x2:");
        double x2 = in.nextFloat();
        System.out.print("Enter the y2:");
        double y2 = in.nextFloat();

        System.out.println(distance(x1,y1,x2,y2));
    }
    static double distance(double x1 ,double y1 , double x2 , double y2 ){
        double ans = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2-y1,2));
        return Math.round(ans *100.0)/100.0;
    }
}
