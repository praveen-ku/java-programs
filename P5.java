
import java.util.Scanner;

public class P5 {

    public static void main(String args[]) {
        double marks;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks(%): ");
        marks = sc.nextDouble();

        if (marks >= 70) {
            System.out.println("\nDISTINCTIVE");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("\nFIRST CLASS");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("\nSECOND CLASS");
        } else if (marks >= 35 && marks < 50) {
            System.out.println("\nTHIRD CLASS");
        } else {
            System.out.println("\nFAIL");
        }
    }
}
