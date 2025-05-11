
import java.math.BigInteger;
import java.util.Scanner;

public class Fibonnacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms:" + " " );
        int n = input.nextInt();
        BigInteger num1 = BigInteger.ZERO ;
        BigInteger num2 = BigInteger.ONE ;
        BigInteger temp;
        if (n <= 0){
            System.out.println("Enter a valid range!");
        } else if (n == 1) {
            System.out.println(num1);
        }else {
            for (int i = 0; i < n; i++) {
                System.out.print(num1 + ",");
                temp = num1;
                num1 = num2;
                num2 = temp.add(num2);
            }
        }
    }
}
