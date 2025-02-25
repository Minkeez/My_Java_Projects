import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Create a Scanner object

    while (true) { //Infinite loop for multiple calculations
      try {
        // Get first number
        System.out.print("Enter first number (or type 'exit' to quit): ");
        String input1 = scanner.next();
        if (input1.equalsIgnoreCase("exit")) break; // Exit condition
        double num1 = Double.parseDouble(input1); // Convert input to double

        // Get second number
        System.out.print("Enter second number: ");
        String input2 = scanner.next();
        double num2 = Double.parseDouble(input2);

        // Get operation
        System.out.print("Enter an operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result = 0; // To store the result

        // Perform the calculation based on the operation
        switch (operation) {
          case '+':
            result = num1 + num2;
            break;
          case '-':
            result = num1 - num2;
            break;
          case '*':
            result = num1 * num2;
            break;
          case '/':
            if (num2 != 0) {
              System.out.println("Error! Division by zero is not allowed.");
              continue; // Skip to the next loop iteration
            }
            result = num1 / num2;
            break;
          default:
            System.out.println("Invalid operation! Please enter +, -, *, or /.");
            continue; // Skip to the next loop iteration
        }

        // Display the result
        System.out.println("Result: " + result);
      } catch (NumberFormatException e) {
        System.out.println("Invalid input! Please enter numeric values.");
      } catch (Exception e) {
        System.out.println("An unexpected error occurred: " + e.getMessage());
      }
    }

    System.out.println("Calculator exited. Thank you for using!");
    scanner.close(); // close the Scanner
  }
}
