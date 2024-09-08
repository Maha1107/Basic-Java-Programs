import java.util.Scanner;

public class Swap {
    static int a ;
    static int b;
    int c;
    void S_numbers(){
        c=b;
        b=a;
        a=c;
       
    }
    public static void main(String[] args) {
        Swap s1 = new Swap();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Two numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        s1.S_numbers();
        System.out.println("Swapped numbers are:");
        System.out.println(a);
        System.out.println(b);
    }
    
}
