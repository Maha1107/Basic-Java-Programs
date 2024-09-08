public class BinaryStringAdd {
   
        public static String addBinary(String a, String b) {
            int num1 = Integer.parseInt(a, 2);  // Convert binary string a to an integer
            int num2 = Integer.parseInt(b, 2);  // Convert binary string b to an integer
            int sum = num1 + num2;              // Add the two integers
            return Integer.toBinaryString(sum); // Convert the sum back to a binary string
        }
    
        public static void main(String[] args) {
            String a = "1010";
            String b = "1101";
            
            String result = addBinary(a, b);
            System.out.println("Sum: " + result);
        }
    }
    

