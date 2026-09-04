
import java.util.Scanner;

class Calculator {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Select operation:");
            System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide");
            System.out.print("Enter choice (1-4): ");
            int choice = scanner.nextInt();

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result;

            switch (choice) {
                case 1 -> {
                    result = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + result);
                }
                case 2 -> {
                    result = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + result);
                }
                case 3 -> {
                    result = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + result);
                }
                case 4 -> {
                    if (num2 == 0) {
                        System.out.println("Error! Division by zero.");
                    } else {
                        result = num1 / num2;
                        System.out.println(num1 + " / " + num2 + " = " + result);
                    }
                }
                default ->
                    System.out.println("Invalid choice!");
            }
        }
    }
}
