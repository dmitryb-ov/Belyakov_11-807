import java.util.Scanner;

public class Homework02_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write string");
        String str = sc.next();
        System.out.println("Write number");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            char symbol = str.charAt(str.length()-1);
            str = symbol + str.substring(0, str.length()-1);
        }
        System.out.println("Output: "+str);
    }
}
