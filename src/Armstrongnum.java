import java.util.Scanner;

public class Armstrongnum {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter the number:");
        int num = in.nextInt();
        System.out.println(armstrong(num));

    }
    static boolean armstrong(int n){
        int sum = 0;
        int m = n;
        while(m>0){
            int rem = n % 10 ;
            sum = sum + rem * rem * rem ;
            m = m / 10;
        }
        return n == sum;
    }
}
