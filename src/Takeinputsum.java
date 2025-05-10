import java.util.Scanner;

public class Takeinputsum {
    public static void main(String[] args) {

        sum();
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        int positiveevennum = 0;
        int positiveoddsum = 0;
        int negativenum = 0;
        System.out.print("Enter the number:");

        while (true){

            int num = in.nextInt();
            if (num == 0){
                break;
            }
            if (num < 0 ){
                negativenum += num;
            }else {
                if (num % 2 == 0){
                    positiveevennum += num;

                }else {
                    positiveoddsum += num;
                }
            }

        }
        System.out.println("sum of negative numbers:" + negativenum );
        System.out.println("sum of positive even numbers:" + positiveevennum );
        System.out.println("sum of postive odd numbers:" + positiveoddsum );
    }
}
