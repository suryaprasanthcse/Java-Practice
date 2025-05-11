import java.util.Scanner;

public class Ebbill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the customer id : ");
        int customer_id = input.nextInt();
        System.out.print("Enter the unit:");
        int unit =  input.nextInt();
        int charge = 0;
        int price = 0 ;

        if (unit < 0){
            System.out.println("Enter a valid unit");
        } else if (unit <= 100) {
            System.out.println("no charge ");
            charge = 0;
            price = 0;
        } else if (unit > 100 && unit <= 200) {
            System.out.println("You have a 3 rs of charge per unit above the 100 limit ");
            charge = 3;
            unit =  unit - 100;
            price = charge * unit ;
        } else if (unit > 200 && unit <= 300) {
            System.out.println("You have a 6 rs of charge per unit above the 100 limit ");
            charge = 6 ;
            unit -= 100;
            price = unit * charge ;
        } else if (unit > 300 && unit <= 400) {
            System.out.println("You have a 9 rs of charge per unit above the 100 limit ");
            charge = 9 ;
            unit -= 100;
            price = unit * charge ;
        } else {
            System.out.println("You have a 15 rs of charge per unit above the 100 limit ");
            charge = 15 ;
            unit -= 100 ;
            price = unit * charge;
        }
        System.out.println("The total cost is" + " " + price);
    }
}
