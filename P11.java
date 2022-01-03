
import java.util.Scanner;

public class P11 {

    public static void main(String args[]) {
        String str, revStr = "";
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        str = sc.nextLine();

        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);      
            revStr = ch + revStr;
        }
        
        if (str.equals(revStr)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
