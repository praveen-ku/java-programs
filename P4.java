import java.util.Scanner;

public class P4 {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a integer: ");
        n = sc.nextInt();
        
        if (n > 0) {
            System.out.println("\nPOSITIVE");
        } else if (n < 0) {
            System.out.println("\nNEGATIVE");
        } else {
            System.out.println("\nZERO");
        }
       
    }
}
