import java.util.Scanner;

public class StudentPassFail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student's marks (out of 100): ");
        int marks = scanner.nextInt();

        if (marks >= 40) {
            System.out.println("Student has passed!");
        } else {
            System.out.println("Student has failed.");
        }
    }
}