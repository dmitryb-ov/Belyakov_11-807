import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write string");
        String str = sc.next();
        char[] symbols = str.toCharArray();
        System.out.println("Write register. u/l?");
        String reg = sc.next();
        switch (reg) {
            case "u":
            case "U":
                System.out.print("Upper case: ");
                for (int i = 0; i < symbols.length; i++) {
                    System.out.print(Character.toUpperCase(symbols[i]));
                }
                break;
            case "l":
            case "L":
                System.out.println("Lower case: ");
                for (int i = 0; i < symbols.length; i++) {
                    System.out.print(Character.toLowerCase(symbols[i]));
                }
                break;
            default:
                System.out.println("Wrong number");
        }
    }
}
