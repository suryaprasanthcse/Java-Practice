import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num1 = in.nextInt();
        System.out.println(factorial(num1));
    }

     static int factorial(int num1) {
        if (num1 == 1 || num1 == 0){
            return 1;

        }else {
            return num1 * factorial(num1-1);
        }

    }
}
