import java.util.Scanner;

public class l1_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");

        for(int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("\nChecking Numbers:");

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] > 0) {
                if(numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is Positive and Even");
                } else {
                    System.out.println(numbers[i] + " is Positive and Odd");
                }
            }
            else if(numbers[i] < 0) {
                System.out.println(numbers[i] + " is Negative");
            }
            else {
                System.out.println(numbers[i] + " is Zero");
            }
        }

        // Compare first and last element
        System.out.println("\nComparing First and Last Element:");

        if(numbers[0] == numbers[4]) {
            System.out.println("First and Last elements are Equal");
        }
        else if(numbers[0] > numbers[4]) {
            System.out.println("First element is Greater");
        }
        else {
            System.out.println("Last element is Greater");
        }

        sc.close();
    }
}