import java.util.Scanner;

public class Evendaysofmonth {
    public static void main(String[] args) {
        even();
    }

    static void even(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the month:");
        String month_1 = in.nextLine();
        month_1 = month_1.toLowerCase();
        int days;
        int i = 1;
        int count = 0;

//        if (month_1.equals("august")){
//            days = 31;
//            while (i<=days){
//                if(i % 2 == 0){
//                    System.out.print(i + " ");
//                }
//                i = i + 1;
//            }
//
//
//        }
         switch (month_1){
             case "january", "may", "march", "july", "august", "october", "december" -> days = 31;
             case "february" -> days = 28;
             case "april", "june", "september", "november" -> days = 30;
             default -> {
                 System.out.println("Enter a valid month");
                 return;
             }


         }
         while ( i <= days){
             if (i % 2 == 0){
                 System.out.print(i + " ");
                 count += 1;
             }
             i = i + 1;

         }
        System.out.println("The no.of days Kunal can go out :"+ count);


    }
}
