import java.math.BigInteger;
import java.util.Scanner;

public class Ncr_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, r;

        while (true) {
            System.out.print("Enter the available elements (n): ");
            n = in.nextInt();

            System.out.print("Enter the choosing elements (r): ");
            r = in.nextInt();

            if (n >= 0 && r >= 0 && n >= r) {
                break;
            } else {
                System.out.println("Invalid input! n should be >= r and both non-negative.");
            }
        }

        in.close();

        BigInteger result = nCr(n, r);
        System.out.println("nCr = " + result);
    }

    static BigInteger nCr(int n, int r) {
        return factorial(n).divide(factorial(r).multiply(factorial(n - r)));
    }

    static BigInteger factorial(int num) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= num; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
