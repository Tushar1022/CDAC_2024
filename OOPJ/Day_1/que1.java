import java.util.Scanner;

public class que1 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a numerical grade
        System.out.print("Enter numerical grade: ");
        
        // Read the numerical grade from the user
        double numericalGrade = scanner.nextDouble();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Convert numerical grade to letter grade using if-else statements
        String letterGrade;
        if (numericalGrade >= 90) {
            letterGrade = "A";
        } else if (numericalGrade >= 80) {
            letterGrade = "B";
        } else if (numericalGrade >= 70) {
            letterGrade = "C";
        } else if (numericalGrade >= 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }

        // Display the corresponding letter grade
        System.out.println("Letter grade: " + letterGrade);
    }
}
