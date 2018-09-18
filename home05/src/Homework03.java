import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write string");
        String str = sc.next();
        char[] symbols = str.toCharArray();
        int[] num = new int[symbols.length];
        for (int i = 0; i < symbols.length; i++) {
            num[i] = Character.getNumericValue(symbols[i]);
            System.out.print(num[i]);
        }
    }
}

