package hakerhank;
import java.util.Scanner;

public class Java03IntDoubleString {


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int i = scan.nextInt();
            double d = Double.parseDouble(scan.next());
            scan.nextLine();
            String s = scan.nextLine();

            // Write your code here.

            System.out.println("String: " + s);
            System.out.println("Double: " + d);
            System.out.println("Int: " + i);
        }
    }

