import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write number");
        int x = sc.nextInt();
        System.out.println(task_Recursion_E(x));
    }
    static int task_Recursion_E(int x){
        if(x > 10){
            return x%10+task_Recursion_E(x/10);
        } else return x;
    }
}
