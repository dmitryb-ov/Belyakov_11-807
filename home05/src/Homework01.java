import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rez = 0;
        boolean k = false;
        double one = 0;
        while (true) {
            if (k) {
                one = rez;
            } else {
                System.out.println("Write first num");
                one = sc.nextDouble();
            }
            System.out.println("Write argument");
            String arg = sc.next();
            System.out.println("Write second num");
            double sec = sc.nextDouble();
            if (arg.equals("+")) {
                rez = one + sec;
            } else if (arg.equals("-")) {
                rez = one - sec;
            } else if (arg.equals("*")) {
                rez = one * sec;
            } else if (arg.equals("/")) {
                rez = one / sec;
            }
            System.out.println("Output: " + rez);
            System.out.println("Reset result? y/n");
            String dagr = sc.next();
            if (dagr.equals("n")) {
                k = true;
            } else {
                k = false;
            }
        }
    }
}
