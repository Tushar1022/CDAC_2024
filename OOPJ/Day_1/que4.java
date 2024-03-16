import java.util.Scanner;

public class que4 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number representing a weekday
        System.out.print("Enter a number representing a weekday (1-7): ");

        // Read the input from the user
        int weekdayNumber = scanner.nextInt();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Determine the weekday name using switch-case
        String weekdayName;
        switch (weekdayNumber) {
            case 1:
                weekdayName = "Sunday";
                break;
            case 2:
                weekdayName = "Monday";
                break;
            case 3:
                weekdayName = "Tuesday";
                break;
            case 4:
                weekdayName = "Wednesday";
                break;
            case 5:
                weekdayName = "Thursday";
                break;
            case 6:
                weekdayName = "Friday";
                break;
            case 7:
                weekdayName = "Saturday";
                break;
            default:
                weekdayName = "Invalid weekday number";
        }

        // Display the weekday name
        System.out.println("Weekday: " + weekdayName);
    }
}
