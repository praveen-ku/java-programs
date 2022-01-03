import java.util.Scanner;

public class P3 {
    public static void main(String args[]) {
        int m1, m2, m3, total;
        double per;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Marks 1: ");
        m1 = sc.nextInt();
        
        System.out.print("Marks 2: ");
        m2 = sc.nextInt();
        
        System.out.print("Marks 3: ");
        m3 = sc.nextInt();
        
        total = m1 + m2 + m3;
        per = (total * 100) / 300;
       
        
        System.out.println("\nTOTAL: " + total);
        System.out.println("PERCENTAGE: " + per);
    }
}
