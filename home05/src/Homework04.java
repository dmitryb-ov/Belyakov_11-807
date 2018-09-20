import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write string");
        String str = sc.next();
        char[] symbols = str.toCharArray();
        System.out.println("Write register. u/l?");
        String reg = sc.next();
        int x = 0;
        char xchar = '\0';
        switch (reg) {
            case "u":
            case "U":
                System.out.print("Upper case: ");
                for (int i = 0; i < symbols.length; i++) {
                    if (symbols[i] >= 97 && symbols[i] <= 122) {
                        x = symbols[i]-32;
                        xchar = (char) x;
                        System.out.print(xchar);
                    }else {
                        System.out.print(symbols[i]);
                    }
                    //System.out.print(Character.toUpperCase(symbols[i]));
                }
                break;
            case "l":
            case "L":
                System.out.print("Lower case: ");
                for (int i = 0; i < symbols.length; i++) {
                    if(symbols[i] >= 65 && symbols[i] <= 90){
                        x = symbols[i]+32;
                        xchar = (char) x;
                        System.out.print(xchar);
                    }else {
                        System.out.print(symbols[i]);
                    }
                    //System.out.print(Character.toLowerCase(symbols[i]));
                }
                break;
            default:
                System.out.println("Wrong number");
        }
    }
}
