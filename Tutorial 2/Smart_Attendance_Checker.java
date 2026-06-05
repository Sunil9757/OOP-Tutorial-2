import java.util.Scanner;

public class Smart_Attendance_Checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total classes conducted: ");
        int totalClasses = sc.nextInt();

        System.out.print("Enter classes attended: ");
        int attendedClasses = sc.nextInt();

        if (totalClasses == 0) {
            System.out.println("Invalid Data: Total classes cannot be zero.");
        }
        else if (attendedClasses > totalClasses || attendedClasses < 0) {
            System.out.print("Invalid Data: Attended classes cannot be greater than total classes or negative.");
        }
        else {
            double attendancePercentage = ((double) attendedClasses / totalClasses) * 100;
            System.out.printf("Attendance Percentage: %.2f%%\n", attendancePercentage);

            if (attendancePercentage >= 75) {
                System.out.println("Eligible for Exam");
            } else {
                System.out.println("Not Eligible");
            }
        }
        sc.close();
        }
}