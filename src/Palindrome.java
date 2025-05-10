import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the word:");
        String a = input.nextLine();
        String b = "";
        int length = a.length()-1;
        for (int i = length; i >= 0; i-- ) {
             b = b + a.charAt(i);
        }
        System.out.println(b);
        if (b.equals(a)){
            System.out.println("It is a Palindrome!");
        }else {
            System.out.println("It is not a Palindrome!");
        }
    }
}
