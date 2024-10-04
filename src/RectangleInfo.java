import java.util.Scanner;
public class RectangleInfo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = getValidInput(scanner, "Enter the width of the rectangle: ");
        double height = getValidInput(scanner, "Enter the height of the rectangle: ");

        System.out.printf("The dimensions of the rectangle are: Width = %.2f, Height = %.2f\n", width, height);
    }

    public static double getValidInput(Scanner scanner, String prompt) {
        double value;
        do {
            System.out.print(prompt);
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next(); // Clear the invalid input
                System.out.print(prompt);
            }
            value = scanner.nextDouble();
        } while (value <= 0);
        return value;
    }
}
