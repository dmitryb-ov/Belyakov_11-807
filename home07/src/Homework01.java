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

    static int task_recursion_D(int x) {
        if (x == 1) {
            return 1;
        } else if(x % 2 == 0){
            return task_recursion_D(x / 2);
        }
        return 0;
    }
}
