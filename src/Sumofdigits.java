import java.util.Scanner;

public class Sumofdigits {
    public static void main(String[] args) {
        System.out.println(sum());
    }
    static int sum (){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = in.nextInt();
        int rem = 0;
        int sum = 0 ;
        while (num > 0 ){
            rem = num % 10;
            sum = sum + rem ;
            num = num / 10;

        }in.close();
        return sum;



    }
}
