import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write string");
        String str = sc.next();
        if (task_Recursion_J(str) == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static int task_Recursion_J(String str) {
        if (str.length() == 1 || str.length() == 2) {
            return 1;
        } else if (str.substring(0,1).equals(str.substring(str.length() - 1))) {
            return task_Recursion_J(str.substring(1, str.length() - 1));
        } else {
            return 0;

        }
    }
}
