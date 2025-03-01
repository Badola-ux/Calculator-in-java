import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;  
        double num1, num2, result;

        System.out.println("\n===== Simple Calculator =====");

        do {
            // Display the menu
            System.out.println("\nChoose an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            // Validate integer input
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number between 1 and 5.");
                scanner.next(); // Consume invalid input
                continue;
            }

            choice = scanner.nextInt();  

            if (choice >= 1 && choice <= 4) {
                // Accept two numbers for the operation
                System.out.print("Enter the first number: ");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Invalid input! Please enter a valid number.");
                    scanner.next();
                }
                num1 = scanner.nextDouble();

                System.out.print("Enter the second number: ");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Invalid input! Please enter a valid number.");
                    scanner.next();
                }
                num2 = scanner.nextDouble();

                switch (choice) {
                    case 1:
                        result = num1 + num2;
                        System.out.printf("Result: %.2f + %.2f = %.2f%n", num1, num2, result);
                        break;
                    case 2:
                        result = num1 - num2;
                        System.out.printf("Result: %.2f - %.2f = %.2f%n", num1, num2, result);
                        break;
                    case 3:
                        result = num1 * num2;
                        System.out.printf("Result: %.2f * %.2f = %.2f%n", num1, num2, result);
                        break;
                    case 4:
                        if (num2 != 0) {
                            result = num1 / num2;
                            System.out.printf("Result: %.2f / %.2f = %.2f%n", num1, num2, result);
                        } else {
                            System.out.println("Error: Division by zero is undefined.");
                        }
                        break;
                }
            } else if (choice == 5) {
                System.out.println("Exiting the calculator. Goodbye!");
            } else {
                System.out.println("Invalid choice. Please select a valid option.");
            }
        } while (choice != 5); 

        scanner.close();
    }
}


