import java.util.Scanner;
public class Simpleinterest {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the principle:");
        int p = input.nextInt();
        System.out.print("Enter the duration in years:");
        int n = input.nextInt();
        System.out.print("Enter the rate of interest:");
        float r = input.nextFloat();
        System.out.println("The Simple interest is"+" " + (p*n*r)/100);

    }
}
