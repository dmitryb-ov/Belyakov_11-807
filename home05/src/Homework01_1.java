import java.util.Scanner;

public class Homework01_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rez = 0;
        boolean s = true;
        boolean k = false;
        double one = 0;
        //-------------------------------------------------------------------------------------------------------------
        while (s) {
            if (k) {
                one = rez;
            } else {
                System.out.println("Write first num");
                one = sc.nextDouble();
            }
            //---------------------------------------------------------------------------------------------------------
            System.out.println("Write argument");
            String arg = sc.next();
            //---------------------------------------------------------------------------------------------------------
            System.out.println("Write second num");
            double sec = sc.nextDouble();
            //---------------------------------------------------------------------------------------------------------
            switch (arg) {
                case "+":
                    rez = one + sec;
                    break;
                case "-":
                    rez = one - sec;
                    break;
                case "*":
                    rez = one * sec;
                    break;
                case "/":
                    rez = one / sec;
                    break;
                default:
                    System.out.println("Wrong argument");
            }//---------------------------------------------------------------------------------------------------------
            System.out.println("Output: " + rez);
            System.out.println("Reset result? Y/N");
            String vib = sc.next();
            switch (vib) {
                case "N":
                case "n":
                    k = true;
                    break;
                case "y":
                case "Y":
                    k = false;
                    break;
                default:
                    System.out.println("Wrong argument,stop program");
                    s = false;
            }
        }
    }
}
