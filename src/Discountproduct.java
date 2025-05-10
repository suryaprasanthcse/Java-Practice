import java.util.Scanner;

public class Discountproduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the total cost :");
        float cost = input.nextFloat();
        System.out.print("Enter the discount percentage:");
        float discount = input.nextFloat();

        float final_price = cost * (discount/100);

        System.out.println("The final price is"+ " " + (cost-final_price));

    }
}
