import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write quantity");
        //global var`s
        int n = sc.nextInt();
        int[] mas = new int[n];
        int x = 0;
        int y = 0;
        //
        System.out.println("Write number");
        for (int i = 1; i < mas.length; i++) {
            mas[i] = sc.nextInt();
        }
        for (int i = 1; i < mas.length-1; i++) {
            if ((mas[i] >= mas[i - 1]) & (mas[i] <= mas[i + 1])) {
                x++;
            }
            if ((mas[i] >= mas[i + 1]) & (mas[i] <= mas[i - 1])) {
                y++;
            }
        }
        if((x > 0) & (y > 0)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
