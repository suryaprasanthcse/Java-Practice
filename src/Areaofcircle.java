import java.util.Scanner;

public class Areaofcircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle:");
        float rad = input.nextFloat();
        System.out.println(area_circle(rad));

    }
    static float area_circle(float rad1){


        return 3.14f*(float) Math.pow(rad1,2);
    }
}
