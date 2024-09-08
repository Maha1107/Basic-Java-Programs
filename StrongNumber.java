import java.util.Scanner;
public class StrongNumber {
    public static int factorial(int n) {
        if (n == 0) {
            return 1; // Base case: factorial of 0 is 1
        } else {
            return n * factorial(n - 1); // Recursive call
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int A = number;
        int sum = 0;

        while(number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }

        if(sum == number) {
            System.out.println(A+ " is a Strong Number.");
        } 
        else {
            System.out.println(A + " is not a Strong Number.");
        }

    }
 
    
}
