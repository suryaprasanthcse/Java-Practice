import java.util.Scanner;

public class Perfectnumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num_copy;
        while (true) {
            System.out.print("Enter the number:");
            int num = in.nextInt();
            if (num > 0){
                num_copy = num;
                break;
            }else {
                System.out.println("Enter a positive number!");
            }
        }

        if (is_perfectnumber(num_copy)){
            System.out.println("The given number " + num_copy + " is a perfect number!");
        }else {
            System.out.println("The given number " + num_copy + " is not a perfect number!");
        }
        perfect_numbers();
    }
    static boolean is_perfectnumber (int num){
        int perfect_check = 0;
        for (int i = 1 ; i <= num/2; i++ ){
            if (num % i == 0){
                perfect_check += i;
            }

        }
        return num == perfect_check;
    }
    static void perfect_numbers (){
        Scanner in = new Scanner(System.in);
//        while (true) {
            System.out.print("Enter the range of numbers(enter 0 or negative num to exit):");
            int num = in.nextInt();
//            if (num == 0){
//                break;
//            } else if (num < 0) {
//                break;
//            }

            for (int i = 1; i <= num; i++) {
                if (is_perfectnumber(i)) {
                    System.out.print(i + " ");
                }
            }

    }
}
