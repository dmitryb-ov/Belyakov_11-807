import java.lang.reflect.Array;
import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write quantity");
        int kol = sc.nextInt();
        int[] num = new int[kol];
        System.out.println("Write numbers");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        rowOfNumbers(num);
    }

    static void rowOfNumbers(int[] num) {
        int k = 1;
        int max = -1;
        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] == num[i + 1]) {
                k++;
            } else if (k > max) {
                max = k;
                k = 1;
            }
        }
        if(max == 1){
            System.out.println("No");
        }else {
            System.out.println(max);
        }
    }
}
