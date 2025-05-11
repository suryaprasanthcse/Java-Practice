import java.util.Scanner;

public class Switchfruit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the fruit : ");
//        String fruit = input.next();
        System.out.print("Enter the day:");
        int day = input.nextInt();

//        switch (fruit) {
//            case "mango" -> System.out.println("National fruit");
//            case "grapes" -> System.out.println("fruits that come in bunch");
//            case "apple" -> System.out.println("Available in Shimla");
//            default -> System.out.println("Enter a valid fruit!");
//        }
        switch (day) {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("Enter a valid day!");
        }
    }
}
