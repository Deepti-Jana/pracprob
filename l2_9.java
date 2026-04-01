import java.util.Scanner;

public class l2_9{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int students = 5;
        int subjects = 3;

        int[][] marks = new int[students][subjects];
        double[] percentage = new double[students];
        char[] grade = new char[students];

        // Taking input
        for(int i = 0; i < students; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));

            System.out.print("Physics: ");
            marks[i][0] = sc.nextInt();

            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextInt();

            System.out.print("Maths: ");
            marks[i][2] = sc.nextInt();
        }

        // Calculate percentage and grade
        for(int i = 0; i < students; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            if(percentage[i] >= 90)
                grade[i] = 'A';
            else if(percentage[i] >= 75)
                grade[i] = 'B';
            else if(percentage[i] >= 60)
                grade[i] = 'C';
            else if(percentage[i] >= 50)
                grade[i] = 'D';
            else
                grade[i] = 'F';
        }

        // Display Result
        System.out.println("\nStudent Results:");

        for(int i = 0; i < students; i++) {
            System.out.println("Student " + (i + 1) +
                    " Percentage: " + percentage[i] +
                    " Grade: " + grade[i]);
        }

        sc.close();
    }
}