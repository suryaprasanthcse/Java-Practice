import java.util.Scanner;

public class Calculatecgpa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the gpa for  sem1:");
        double sem1 = in.nextDouble();
        System.out.print("Enter the gpa for sem2:");
        double sem2 = in.nextDouble();
        System.out.print("Enter the gpa for sem3:");
        double sem3 = in.nextDouble();
        System.out.print("Enter the gpa for sem4:");
        double sem4 = in.nextDouble();
        System.out.print("Enter the gpa for sem5:");
        double sem5 = in.nextDouble();
        System.out.print("Enter the gpa for sem6:");
        double sem6 = in.nextDouble();
//        System.out.print("Enter the gpa for sem7");
//        double sem7 = in.nextDouble();
//        System.out.print("Enter the gpa for sem8:");
//        double sem8 = in.nextDouble();
        
        double cgpa = sem1 + sem2 + sem3 + sem4 + sem5 + sem6;
        cgpa = cgpa / 6;
        cgpa = Math.round(cgpa * 100.0)/100.0;
        System.out.println("Your cgpa is " + cgpa);

    }
}
