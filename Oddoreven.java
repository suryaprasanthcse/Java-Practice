import java.util.Scanner;

public class Oddoreven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        int a = input.nextInt();


        if (a%2==0) {
            System.out.println("It is a even number");
        }
            else{
            System.out.println("It is a odd number");
        }
    }
}
