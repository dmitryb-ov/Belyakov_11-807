import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write string");
        String str = sc.next();
        System.out.println("Write first number");
        int first = sc.nextInt();
        System.out.println("Write second number");
        int second = sc.nextInt();
        char[] symbols = str.toCharArray();
        /*str = str.substring(0,first) + str.substring(second);
        System.out.println(str);*/
        char one = '\0';
        for (int i = first; i <=  second; i++) {
            symbols[i] = one;
        }
        for (int i = 0; i < symbols.length; i++) {
            String strResult = (""+symbols[i]);
            System.out.print(strResult);
        }
    }
}
