import java.util.Scanner;

public class Fitness_Challenge_Tracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int highest = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.println("Enter Steps for Day " + i + ":");
            int steps = sc.nextInt();

            total += steps;

            if (steps > highest) {
                highest = steps;
            }
        }
        double average= (double) total/7;
        System.out.println("total Steps:" + total);
        System.out.println("Average Steps:" + average);
        System.out.println("Highest Steps:" + highest);
        sc.close();
    }
}
