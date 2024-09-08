/*The Fibonacci series is a sequence of numbers where each number is the sum of the two preceding ones,
 usually starting with 0 and 1*/

public class Fibnocci {
   
        public static void main(String[] args) {
            int n = 10; // Number of terms in the Fibonacci series
            int first = 0, second = 1;
            
            System.out.print("Fibonacci Series: " + first + ", " + second);
            
            for (int i = 3; i <= n; i++) {
                int next = first + second; // Next term is the sum of the previous two
                System.out.print(", " + next);
                first = second; // Update first and second for the next iteration
                second = next;
            }
        }
    }
    
    

