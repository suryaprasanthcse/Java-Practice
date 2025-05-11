import java.util.Scanner;

public class Inputname {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name here:");

        String a = input.nextLine();
        System.out.println("Hello!"+ " " +a);
    }
}
