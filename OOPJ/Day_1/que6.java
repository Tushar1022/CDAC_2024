import java.util.Scanner;

public class que6 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter height in meters
        System.out.print("Enter height in meters: ");
        double height = scanner.nextDouble();

        // Prompt the user to enter weight in kilograms
        System.out.print("Enter weight in kilograms: ");
        double weight = scanner.nextDouble();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Calculate BMI using the formula: BMI = weight / (height * height)
        double bmi = weight / (height * height);

        // Classify BMI into categories using if-else statements
        String bmiCategory;
        if (bmi < 18.5) {
            bmiCategory = "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            bmiCategory = "Normal weight";
        } else if (bmi >= 25 && bmi < 30) {
            bmiCategory = "Overweight";
        } else {
            bmiCategory = "Obese";
        }

        // Display the calculated BMI and BMI category
        System.out.println("BMI: " + bmi);
        System.out.println("BMI Category: " + bmiCategory);
    }
}
