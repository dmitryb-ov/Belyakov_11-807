import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write x");
        int x = sc.nextInt();
        System.out.println("Write del");
        int del = sc.nextInt();
        if(task_Recursion_H(x,del) == 1){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
    static int task_Recursion_H(int x, int del){
        if(x < 2 || x % del == 0){
            return 0;
        } else if(x == 2){
            return 1;
        } else if(del < x/2){
            return  task_Recursion_H(x, del+1);
        } else {
            return 1;
        }
    }
}
