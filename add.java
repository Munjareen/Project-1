import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num7 = scanner.nextInt();

        // Calculate the sum
        int sum = num1 + num7;

        // Display the result
        System.out.println("The sum of " + num1 + " and " + num7 + " is: " + sum);

        scanner.close();
    }
}
