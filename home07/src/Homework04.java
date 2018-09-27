import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write x");
        int x = sc.nextInt();
        //int dop  = sc.nextInt();
        task_Recursion_I(x, 2);
    }

    static int task_Recursion_I(int x, int dop) {
        if (x/2 < dop) {
            System.out.print(x);
            return 0;
        }
        if (x % dop == 0) {
            System.out.print(dop);
            task_Recursion_I(x / dop, dop);
        } else {
            task_Recursion_I(x, ++dop);
        }
        return 0;
    }
}
