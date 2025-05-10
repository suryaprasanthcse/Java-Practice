import java.util.Scanner;

public class Areaoftriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the height of the triangle:");
        float length = in.nextFloat();
        System.out.print("Enter the base of the triangle:");
        float breadth = in.nextFloat();
        System.out.println(areaoftriangle(length,breadth));
    }

     static float areaoftriangle(float length, float breadth) {
        return 0.5f * length* breadth;
    }
}
