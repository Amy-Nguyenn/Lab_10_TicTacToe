import java.util.Scanner;

public class SafeInput {

    // Method to get an integer within a specified range
    public static int getRangedInt(Scanner console, String prompt, int low, int high) {
        int userInput;
        do {
            System.out.print(prompt);
            while (!console.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                console.next(); // Clear invalid input
                System.out.print(prompt);
            }
            userInput = console.nextInt();
            if (userInput < low || userInput > high) {
                System.out.println("Input must be between " + low + " and " + high + ".");
            }
        } while (userInput < low || userInput > high);
        return userInput;
    }

    // Method to get a yes/no confirmation from the user
    public static boolean getYNConfirm(Scanner console, String prompt) {
        String response;
        do {
            System.out.print(prompt);
            response = console.next().trim().toLowerCase();
            if (!response.equals("y") && !response.equals("n")) {
                System.out.println("Invalid input. Please enter 'Y' or 'N'.");
            }
        } while (!response.equals("y") && !response.equals("n"));

        return response.equals("y");
    }
}
