import java.util.Scanner;

public class Logical_Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = 0, num2 = 0, num3 = 3;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter number " + i + ":");
            if (i == 1) num1 = sc.nextInt();
            else if (i == 2) num2 = sc.nextInt();
            else if (i == 3) num3 = sc.nextInt();
        }

            boolean isSum = (num3 == (num1 + num2));

            if (isSum) {
                System.out.println(num3 + " is sum of " + num1 + " and " + num2);
            } else {
                System.out.println(num3 + " is not sum of " + num1 + " and " + num2);
            }

            sc.close();
    }
}