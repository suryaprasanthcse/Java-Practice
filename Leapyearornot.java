import java.util.Scanner;

public class Leapyearornot {
    public static void main(String[] args) {
        leapyear();
    }
    static void leapyear (){
        Scanner in = new Scanner (System.in);
        System.out.print("Enter the year:");
        int year = in.nextInt();
        if ((year%4 == 0) ) {
            if((year % 400 == 0) || (year% 100 != 0)){
                System.out.println("The year is leap year!");

            }else{
                System.out.println("The year is not a leap year!");
            }
        }else{
            System.out.println("The year is not a leap year!");
        }in.close();

    }
}
