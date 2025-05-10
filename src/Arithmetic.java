import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int num1 = input.nextInt();
        System.out.print("Enter the second number :");
        int num2 = input.nextInt();
        System.out.println("Enter the operator to do operations(+,-,*,/)");
        char operator = input.next().charAt(0);
        if (operator == '+'){
            System.out.println("The sum is :"+" " + (num1 + num2));
        } else if (operator == '-') {
            System.out.println("The difference is :"+" " + (num1 - num2));
        } else if (operator == '*') {
            System.out.println("The product is :" + " " + (num1 * num2));
        } else if (operator == '/') {
            if (num2 != 0){
                System.out.println("The difference is :" + " " + (num1 / num2));
            }else{
                System.out.println("The zero division is not allowed");
            }
        }else{
            System.out.println("Invalid operator,Try again!");
        }
    }
}
