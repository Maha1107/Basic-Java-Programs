import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int a = sc.nextInt();

        if (a % 2 == 1) {
            System.out.println("The number is odd");
        } else {
            System.out.println("The number is even");
        }
        sc.close();
    }
}

