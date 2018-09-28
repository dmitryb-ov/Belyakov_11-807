import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write number");
        int x = sc.nextInt();
        task_recursion_D(x);
        if (task_recursion_D(x) == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static int task_recursion_D(double x) {
        if (x == 1) {
            return 1;
        } else if(x > 1 & x < 2){
            return 0;
        } else {
            return task_recursion_D(x / 2);
        }
    }
}
