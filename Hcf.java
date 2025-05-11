import java.util.Scanner;

public class Hcf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number 1 :");
        int num_1 = in.nextInt();
        System.out.print("Enter the number 2 :");
        int num_2 = in.nextInt();
        in.close();

        System.out.println( "The hcf is " + hcf(num_1,num_2));
    }

     static int hcf(int num1, int num2) {
        int hcf = 1;
         if ((num1 <= 0) || (num2 <= 0)){
             System.out.println("Enter only positive numbers!");
             return 0;

         }
        for (int i = Math.min( num1, num2 ); i >= 1;i--){

            if ((num1 % i == 0) && (num2 % i == 0)){
                hcf = i;
                break ;
            }

        }
         return hcf ;
    }
}
