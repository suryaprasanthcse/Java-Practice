import java.util.Scanner;

public class Palindromenumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number :");
        long num = in.nextLong();
        in.close();

        if(is_palindrome(num)){
            System.out.println("The given number " + num + " is a palindrome");
        }else {
            System.out.println("The given number " + num + " is not a palindrome");
        }
    }
    static boolean is_palindrome (long num){
        long original = num;
        long rem  = 0;
        long reverse_num = 0;

        while (original > 0 ){
            rem = original % 10;
            reverse_num = reverse_num * 10 + rem ;
            original = original / 10 ;
        }
        return num == reverse_num ;
    }
}
