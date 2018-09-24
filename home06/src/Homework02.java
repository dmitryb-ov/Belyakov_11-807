import java.lang.reflect.Array;
import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write string");
        String str = sc.nextLine();
        delinterval(str);
    }

    static void delinterval(String str) {
        char[] symbols = str.toCharArray();
        char none = '\0';
        boolean t = true;
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] == 32) {
                symbols[i] = none;
            }
            str = "" + symbols[i];
            System.out.print(str);
        }
    }
}
