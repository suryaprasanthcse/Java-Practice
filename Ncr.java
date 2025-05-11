import java.util.Scanner;

public class Ncr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a ;
        long b ;
        while (true) {
            System.out.print("Enter the available elements:");
            long n = in.nextInt();
            a = n;
            System.out.print("Enter the choosing elements:");
            long r = in.nextInt();
            b = r ;
            if( (r >= 0) && (n >= r)){
                break;

            }else {
                System.out.println("The available should be greater than choosing and also both should be positive!");
            }
        }
        in.close();
        System.out.println(ncr(a , b ));
    }
    static long ncr (long n , long r){
        long combi = fact(n) /( fact(r) * fact((n-r)));
        return combi;

    }

    static long fact (long n){
        long num = n;
        if ((n == 1) || (n <=0) ){
            return 1 ;
        }


        return num * fact(num - 1);
    }
}
