import java.util.Scanner;

public class l1__3 {

    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return 5000 / perimeter;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1 (meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2 (meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3 (meters): ");
        double side3 = sc.nextDouble();

        double rounds = calculateRounds(side1, side2, side3);

        System.out.println("Number of rounds needed to complete 5km: " + rounds);

        sc.close();
    }
}