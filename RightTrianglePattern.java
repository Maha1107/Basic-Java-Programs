public class RightTrianglePattern {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" *" );//it is just print because if the condition is true it should be print * in same line
            }
            System.out.println(" ");// gap between rows
        }
    }
    
}
