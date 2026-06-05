import java.util.Scanner;
import java.time.Year;

public class AI_Age_Predictor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your current age: ");
        int age = sc.nextInt();

        System.out.println("Age after 10 years: " + (age + 10));
        System.out.println("Age after 25 years: " + (age + 25));
        System.out.println("Age after 50 years: " + (age + 50));

        int currentYear = Year.now().getValue();
        int yearTurn100 = currentYear + (100 - age);
        {
            System.out.println("You will turn 100 in the year: " + yearTurn100);
        }
        sc.close();
    }
}