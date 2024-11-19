import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Multiply {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("input.txt"));
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();

            // Perform multiplication
            double result = num1 * num2;

            // Display the result
            System.out.printf("The result of multiplying %.2f and %.2f is: %.2f\n", num1, num2, result);

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Input file not found.");
        }
    }
}
