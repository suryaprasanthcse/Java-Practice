import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the currency in INR:" + " ");
        float inr = input.nextFloat();

        float usd = 83.5f;
        System.out.println("The converted currency value of inr to usd is" + " " + inr / usd);
    }
}
