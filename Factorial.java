import java.util.Scanner;
public class Factorial {
    
    public static int factorial(int n) {
        if (n == 0) {
            return 1; // Base case: factorial of 0 is 1
        } else {
            return n * factorial(n - 1); // Recursive call
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();

        // Calculating factorial
        int result = factorial(number);

        // Printing the result
        System.out.println("The factorial of " + number + " is: " + result);
    }
}
    

