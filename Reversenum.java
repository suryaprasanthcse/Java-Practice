import java.util.Scanner;

public class Reversenum {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter the number :");
        int n = in.nextInt();
        int rem = 0;
        int sum = 0;

        while (n > 0){
            rem = n % 10;
            sum = sum * 10 + rem ;
            n = n/10;

        }
        System.out.println(sum);
    }
}
