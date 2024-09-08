import java.util.Scanner;
public class PerfectNumbers {
      
        public static void main(String[] args) {
            int s=0;
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter A Number");
            int number=sc.nextInt();
            
            
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    s=s+i;
                    
                    if(s==number){
                        System.out.println(number+" is a perfect number");
                    }
                
            }
            System.out.println(number+ "is not a perfect number");
        }
    }
}
    

